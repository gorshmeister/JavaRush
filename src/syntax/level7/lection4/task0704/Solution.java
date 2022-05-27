package syntax.level7.lection4.task0704;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[10];

        for (int i = 0; i < array.length ; i++) {
            int num = Integer.parseInt(reader.readLine());
            array[i] = num;
        }

        for (int i = 9; i >= 0 ; i--) {
            System.out.println(array[i]);
        }
    }
}
