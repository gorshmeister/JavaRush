package core.level8.lection5.task1808;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        try (FileInputStream inputStream = new FileInputStream(file1);
            FileOutputStream outputStream2 = new FileOutputStream(file2);
            FileOutputStream outputStream3 = new FileOutputStream(file3)) {

            if (inputStream.available() > 0) {
                byte[] buffer = new byte[inputStream.available()];
                int count = (int) Math.ceil(inputStream.read(buffer) / 2);
                outputStream2.write(buffer, 0, count);
                outputStream3.write(buffer, count, count);
            }
        }
    }
}
