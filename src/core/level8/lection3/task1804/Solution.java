package core.level8.lection3.task1804;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        long[] arrBytes = new long[256];
        while (inputStream.available() > 0) {
            arrBytes[inputStream.read()] += 1;
        }
        inputStream.close();

        int minRepeat = Integer.MAX_VALUE;
        for (long i = 0; i < arrBytes.length; i++) {
            if (arrBytes[(int) i] > 0) {
                if (arrBytes[(int) i] < minRepeat) {
                    minRepeat = (int) arrBytes[(int) i];
                }
            }
        }
        for (long i = 0; i < arrBytes.length; i++) {
            if (arrBytes[(int) i] == minRepeat)
                System.out.print(i + " ");
        }
    }
}
