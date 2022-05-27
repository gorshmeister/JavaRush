package core.level9.lection11.task1925;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            args = new String[]{"D:\\IDEA_project\\src\\core\\level9\\lection11\\task1925\\text1",
                    "D:\\IDEA_project\\src\\core\\level9\\lection11\\task1925\\text2"};
        }

        ArrayList<String> list = new ArrayList<>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                String[] splittedLine = line.split("\s");
                list.addAll(Arrays.asList(splittedLine));
                list.removeIf(l -> l.length() < 7);
            }
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]))) {
            String newLine = "";
            for (String word : list) {
                newLine = newLine.concat(word).concat(",");
            }
            bufferedWriter.write(newLine.substring(0, newLine.length() - 1));
        }
    }
}
