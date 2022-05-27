package core.level9.lection5.task1909;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1;
        String file2;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            file1 = reader.readLine();
            file2 = reader.readLine();
        }

        ArrayList<String> list = new ArrayList<String>();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file1))) {
            while (fileReader.ready()) {
                list.add(fileReader.readLine());
            }
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2))) {
            for (String words : list) {
                bufferedWriter.write(words.replaceAll("\\.", "!"));
                bufferedWriter.write("\n");
            }
        }
    }
}
