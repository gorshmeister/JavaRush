package core.level8.lection11.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    static String filePath;
    static List<Product> products = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        if (args.length == 0) return;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        filePath = reader.readLine();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(filePath))) { // initialize table
            while (fileReader.ready()) {
                products.add(getProduct(fileReader.readLine()));
            }
        }

        switch (args[0]) {
            case "-u" -> updateProduct(args);
            case "-d" -> deleteProduct(args[1]);
        }
    }

    public static void updateProduct(String... args) throws IOException {
        int id = Integer.parseInt(args[1]);

        String name = "";
        for (int i = 2; i < args.length - 2; i++) {
            name += args[i] + " ";
        }
        if (name.length() > 30)
            name = name.substring(0, 30);

        String price = args[args.length - 2];
        String quantity = args[args.length - 1];

        for (Product updateProduct : products) {
            if (id == updateProduct.id) {
                updateProduct.setName(name);
                updateProduct.setPrice(price);
                updateProduct.setQuantity(quantity);
            } else if (name.equals(updateProduct.name)) {
                updateProduct.setId(id);
                updateProduct.setPrice(price);
                updateProduct.setQuantity(quantity);
            } else if (price.equals(updateProduct.price)) {
                updateProduct.setId(id);
                updateProduct.setName(name);
                updateProduct.setQuantity(quantity);
            } else if (quantity.equals(updateProduct.quantity)) {
                updateProduct.setId(id);
                updateProduct.setName(name);
                updateProduct.setPrice(price);
            }
        }

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            for (Product product : products) {
                fileWriter.write(product.toString());
                fileWriter.write("\n");
            }
        }
    }

    public static void deleteProduct(String idRemove) throws IOException {
        int id = Integer.parseInt(idRemove);

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).id == id)
                products.remove(i);
        }

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            for (Product product : products) {
                fileWriter.write(product.toString());
                fileWriter.write("\n");
            }
        }
    }

    public static class Product {
        int id;
        String name;
        String price;
        String quantity;

        public Product(int id, String name, String price, String quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return String.format("%-8d%-30s%-8s%-4s", id, name, price, quantity);
        }
    }

    public static Product getProduct(String string) {
        String id = string.substring(0, 8).trim();
        String name = string.substring(8, 38).trim();
        String price = string.substring(38, 46).trim();
        String quantity = string.substring(46).trim();

        return new Product(Integer.parseInt(id), name, price, quantity);
    }
}
