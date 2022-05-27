package core.level8.lection3.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        long[] array = new long[256];

        while (inputStream.available() > 0) {
            array[inputStream.read()] += 1;
        }

        inputStream.close();

        for (long i = 0; i < array.length; i++) {
            if (array[(int) i] > 0) {
                System.out.print(i + " ");
            }

        }

    }

}
