package core.level9.lection7.replacementSystemOut;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class replacementSystemOut {
    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        printSomething();

        String result = outputStream.toString();

        System.setOut(consoleStream);

        StringBuilder stringBuilder = new StringBuilder(result);
        stringBuilder.reverse();
        String reverseString = stringBuilder.toString();

        System.out.println(reverseString);
    }

    public static void printSomething() {
        System.out.println("Я НЕ МИЛ ТЕБЕ");
        System.out.println("УЛЫБОК ТЕБЕ ДЕД МОКАР");
    }
}
