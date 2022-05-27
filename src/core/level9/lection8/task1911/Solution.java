package core.level9.lection8.task1911;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(byteArrayOutputStream);
        System.setOut(stream);

        testString.printSomething();

        System.setOut(consoleStream);

        String result = byteArrayOutputStream.toString().toUpperCase();
        System.out.println(result);


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("It`s a text for testing");
        }
    }
}
