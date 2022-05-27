package syntax.level7.lection4.task0703;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrayString = new String[10];
        int[] arrayInt = new int[10];

        for (int i = 0; i < arrayString.length; i++) {
            String s = reader.readLine();
            arrayString[i] = s;
        }

        for (int i = 0; i < arrayInt.length; i++) {
            int length = arrayString[i].length();
            arrayInt[i] = length;
        }

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }

        System.out.println(Arrays.toString(arrayInt));
    }
}
