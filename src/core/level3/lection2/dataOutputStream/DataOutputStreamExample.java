package core.level3.lection2.dataOutputStream;

import java.io.*;

public class DataOutputStreamExample {

    public static void main(String[] args) throws IOException {

        FileOutputStream outputStream = new FileOutputStream("D:/someFile.txt");
        BufferedOutputStream bufferedStream = new BufferedOutputStream(outputStream);

        String text = "I love Java!"; // эту строку мы преобразуем в массив байтов и запишем в файл

        byte[] buffer = text.getBytes();

        bufferedStream.write(buffer, 0, buffer.length);
        bufferedStream.close();
    }
}