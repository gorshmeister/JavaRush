package core.level8.lection11.task1831;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        try (FileInputStream fileInputStream1 = new FileInputStream(file2);
             FileInputStream fileInputStream2 = new FileInputStream(file3);
             FileOutputStream fileOutputStream = new FileOutputStream(file1)) {
            while (fileInputStream1.available() > 0) {
                int data = fileInputStream1.read();
                fileOutputStream.write(data);
            }
            while (fileInputStream2.available() > 0) {
                int data = fileInputStream2.read();
                fileOutputStream.write(data);
            }
        }
    }
}
