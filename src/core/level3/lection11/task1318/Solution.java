package core.level3.lection11.task1318;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inStream = null;

        while (true) {
            try {
                System.out.print("Введите путь к файлу:");
                inStream = new FileInputStream(reader.readLine());
                break;
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден, попробуй еще раз...");
            }
        }

        while (inStream.available() > 0) {
            char data = (char) inStream.read();
            System.out.print(data);
        }

        inStream.close();
        reader.close();
    }
}
