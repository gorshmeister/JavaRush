package syntax.level7.lection4.task0701;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //create and initialize array
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            int num = Integer.parseInt(reader.readLine());
            array[i] = num;
        }

        return array;
    }

    public static int max(int[] array) {
        //find max
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
