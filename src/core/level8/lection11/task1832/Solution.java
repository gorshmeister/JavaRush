package core.level8.lection11.task1832;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (FileInputStream inputStream2 = new FileInputStream(file2);
             FileInputStream inputStream1 = new FileInputStream(file1)) {

            while (inputStream2.available() > 0) {
                byteArrayOutputStream.write(inputStream2.read());
            }
            while (inputStream1.available() > 0) {
                byteArrayOutputStream.write(inputStream1.read());
            }

            try (FileOutputStream outputStream = new FileOutputStream(file1)) {
                byteArrayOutputStream.writeTo(outputStream);
            }
        }
    }
}
