package core.level8.lection9.fileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("D:\\IDEA_project\\src\\testLines2", true);

        String greeting = "Добро пожаловать на JavaRush - Лучший сайт для тех кто хочет стать программистом!\n";

        outputStream.write(greeting.getBytes());

        outputStream.close();
    }
}
