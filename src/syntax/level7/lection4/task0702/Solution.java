package syntax.level7.lection4.task0702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrayString = new String[10];

        for (int i = 0; i < arrayString.length; i++) {
            String s = reader.readLine();
            arrayString[i] = s;
        }

        for (int i = arrayString.length - 1; i >= 0; i--) {
            System.out.println(arrayString[i]);
        }
    }
}
