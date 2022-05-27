package core.level9.lection8.task1912;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        System.setOut(defaultStream);

        String result = outputStream.toString().replaceAll("te", "??");

        System.out.println(result);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("It`s a text for testing");
        }
    }
}
