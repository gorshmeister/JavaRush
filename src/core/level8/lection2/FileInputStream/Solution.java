package core.level8.lection2.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        //создаем объект FileInputStream, привязанный к файлу <...>.
        FileInputStream inputStream = new FileInputStream("D:\\IDEA_project\\src\\testNumbers");
        long sum = 0;

        while (inputStream.available() > 0) { // Пока остались непрочитанные байты
            int data = inputStream.read(); // Прочитать очередной байт
            sum += data; // Добавить его к общей сумме
        }

        inputStream.close(); // закрываем поток

        System.out.println(sum); // выводим сумму на экран

    }
}
