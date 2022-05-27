package syntax.level4.lection7.task0426;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int x = Integer.parseInt(s);

        if (x > 0) {
            if (x % 2 == 0) {
                System.out.println("Положительное четное число");
            } else
                System.out.println("Положительное нечетное число");
        }

        if (x == 0)
            System.out.println("Ноль");

        if (x < 0) {
            if (x % 2 == 0) {
                System.out.println("Отрицательное четное число");
            } else
                System.out.println("Отрицательное нечетное число");
        }
    }
}
