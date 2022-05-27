package core.level9.lection8.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.ParseException;
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

        String result = outputStream.toString();

        Pattern p1 = Pattern.compile("(\\d) ([+*-]) (\\d)");
        Matcher m1 = p1.matcher(result);
        String znak = null;
        int int1 = 0, int2 = 0;
        while (m1.find()) {
            try {
                int1 = Integer.parseInt(m1.group(1));
                int2 = Integer.parseInt(m1.group(3));
            } catch (Exception e) {
            }
            znak = m1.group(2);
        }

        StringBuilder stringBuilder = new StringBuilder(result.trim());
        switch (znak) {
            case "+" -> System.out.print(stringBuilder.append(" ").append(int1 + int2));
            case "-" -> System.out.print(stringBuilder.append(" ").append(int1 - int2));
            case "*" -> System.out.print(stringBuilder.append(" ").append(int1 * int2));
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}
