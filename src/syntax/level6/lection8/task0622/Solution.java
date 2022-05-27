package syntax.level6.lection8.task0622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] myArr;
        myArr = new int[5];

        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(reader.readLine());
            myArr[i] = num;
        }

        Arrays.sort(myArr);

        for (int i = 0; i < 5; i++) {
            System.out.println(myArr[i]);
        }
    }
}
