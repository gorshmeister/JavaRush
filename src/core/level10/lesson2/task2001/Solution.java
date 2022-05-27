package core.level10.lesson2.task2001;

/*
Читаем и пишем в файл: Human
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null, new File("D:\\IDEA_project\\src\\core\\level10\\lesson2\\task2001\\"));
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99), new Asset("car", 2999.99));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны
            System.out.println(ivanov.equals(somePerson));
            System.out.println(ivanov.hashCode());
            System.out.println(somePerson.hashCode());


        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintStream printStream = new PrintStream(outputStream);
            String isNamePresent = name != null ? "yes" : "no";
            printStream.println(isNamePresent);
            printStream.flush();

            if (name != null) {
                printStream.println(name);
                printStream.println(assets.size());
                for (Asset asset : assets) {
                    printStream.println(asset.getName());
                    printStream.println(asset.getPrice());
                }
                printStream.close();
            }
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String isNamePresent = reader.readLine();

            if (isNamePresent.equals("yes")) {
                name = reader.readLine();
                int assetsCount = Integer.parseInt(reader.readLine());

                for (int i = 0; i < assetsCount; i++) {
                    String assetName = reader.readLine();
                    Double assetPrice = Double.parseDouble(reader.readLine());
                    assets.add(new Asset(assetName, assetPrice));
                }
            }
            reader.close();

        }
    }
}