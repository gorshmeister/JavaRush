package syntax.level8.lection11.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        StringBuilder builder = new StringBuilder(string);
        builder.setCharAt(0, Character.toUpperCase(builder.charAt(0)));
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == ' ') {
                builder.setCharAt(i + 1, Character.toUpperCase(builder.charAt(i + 1)));
            }
        }

        System.out.println(builder);
    }
}
