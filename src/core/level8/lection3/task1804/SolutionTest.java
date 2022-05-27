package core.level8.lection3.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolutionTest {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        long[] arrBytes = new long[256];
        while (inputStream.available() > 0) {
            arrBytes[inputStream.read()] += 1;
        }
        inputStream.close();

        System.out.print("arrBytes[i] : "); // В ячейке под №(byte) содержится ...
        for (long i = 255; i >= 0; i--) {
            if (arrBytes[(int) i] > 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("i : "); // .... столько то повторений
        for (long i = 255; i >= 0; i--) {
            if (arrBytes[(int) i] > 0) {
                System.out.print(arrBytes[(int) i] + " ");
            }
        }

        System.out.println();
        System.out.print("min: ");
        for (long i : arrBytes) {
            if (i == 1) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.print("Arrbyte: ");
        int minRepeat = Integer.MAX_VALUE;
        for (long i = 0; i < arrBytes.length; i++) {
            if (arrBytes[(int) i] > 0) {
                if (arrBytes[(int) i] < minRepeat)
                    minRepeat = (int) arrBytes[(int) i];
            }
        }
        for (long i = 0; i < arrBytes.length; i++) {
            if (arrBytes[(int) i] == minRepeat)
                System.out.print(i + " ");
        }


    }
}
