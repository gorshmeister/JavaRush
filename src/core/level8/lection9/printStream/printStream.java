package core.level8.lection9.printStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class printStream {
    public static final String GREETING_MESSAGE = "My name is %s, my age is %d\n";
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream printStream = new PrintStream("D:\\IDEA_project\\src\\text.pt2");

        printStream.println("Hello!");
        printStream.println("We are robot`s");

        printStream.printf(GREETING_MESSAGE, "Amigo", 18);
        printStream.printf(GREETING_MESSAGE, "R2-D2", 35);
        printStream.printf(GREETING_MESSAGE, "C-3PO", 35);

        printStream.close();
    }
}
