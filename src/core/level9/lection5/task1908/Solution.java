package core.level9.lection5.task1908;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1;
        String file2;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            file1 = reader.readLine();
            file2 = reader.readLine();
        }

        try (BufferedReader fileReader = new BufferedReader(new FileReader(file1));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2))) {
            Pattern p1 = Pattern.compile("\\b\\d+\\b");
            while (fileReader.ready()) {
                String data = fileReader.readLine();
                Matcher m1 = p1.matcher(data);
                while (m1.find()) {
                    bufferedWriter.write(m1.group() + " ");
                }
            }
        }
    }
}
