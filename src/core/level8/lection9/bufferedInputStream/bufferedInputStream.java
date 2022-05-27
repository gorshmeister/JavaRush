package core.level8.lection9.bufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class bufferedInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("D:\\IDEA_project\\src\\text.pt1");

        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 300);

        int data;
        while ((data = bufferedInputStream.read()) != -1) {
            System.out.print((char) data);
        }

        inputStream.close();
        bufferedInputStream.close();


    }
}
