package core.level9.lection5.task1910;

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

        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file1))) {
            while (fileReader.ready()) {
                String data = fileReader.readLine().replaceAll("\n", "");
                list.add(data.replaceAll("\\p{P}", ""));
            }
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2))) {
            for (String s : list) {
                bufferedWriter.write(s);
            }
        }
    }
}
