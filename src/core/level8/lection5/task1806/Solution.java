package core.level8.lection5.task1806;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("D:\\IDEA_project\\src\\testLines");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("D:/IDEA_project/src/txt.txt");

        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }

        inputStream.close();
        outputStream.close();
    }
}
