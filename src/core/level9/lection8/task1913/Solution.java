package core.level9.lection8.task1913;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        System.setOut(defaultStream);

        String result = outputStream.toString().replaceAll("\\D", "");
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething(){
            System.out.println("It`s 1 a 23 4 f5-6or7 tes8ting");
        }
    }
}
