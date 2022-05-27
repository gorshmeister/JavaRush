package syntax.level7.lection12.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        int minimum;
        int maximum;

        int[] list = new int[5];

        getInts(list);

        minimum = list[0];
        maximum = list[0];
        for (int j : list) {
            if (j < minimum)
                minimum = j;

            if (j > maximum)
                maximum = j;
        }

        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts(int[] list) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
        return list;
    }
}
