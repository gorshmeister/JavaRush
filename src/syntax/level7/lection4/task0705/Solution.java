package syntax.level7.lection4.task0705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] big = new int[20];

        for (int i = 0; i < big.length; i++) {
            big[i] = Integer.parseInt(reader.readLine());
        }

        int[] small1 = new int[10];
        int[] small2 = new int[10];

        System.arraycopy(big, 0, small1, 0, 10);
        System.arraycopy(big, 10, small2, 0, 10);

        System.out.println(Arrays.toString(small1));
        System.out.println(Arrays.toString(small2));


    }
}
