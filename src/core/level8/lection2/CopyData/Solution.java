package core.level8.lection2.CopyData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        //Создаем поток-чтения байт из файла
        FileInputStream inputStream = new FileInputStream("D:\\IDEA_project\\src\\testNumbers");
        //Создаем поток записи байт в файл
        FileOutputStream outputStream = new FileOutputStream("D:\\IDEA_project\\src\\testNumbers1");

        while (inputStream.available() > 0) {
            int data = inputStream.read(); // читаем
            outputStream.write(data); // записываем
        }

        inputStream.close();
        outputStream.close();
    }
}
