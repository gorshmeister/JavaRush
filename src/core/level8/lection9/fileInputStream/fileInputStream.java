package core.level8.lection9.fileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class fileInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("D:\\IDEA_project\\src\\testLines2");

        int data;
        while ((data = inputStream.read()) != -1) {
            System.out.print((char) data);
        }

    }
}
