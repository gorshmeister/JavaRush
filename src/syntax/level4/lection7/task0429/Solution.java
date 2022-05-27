package syntax.level4.lection7.task0429;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int x = (a > 0) ? 1 : 0;
        int y = (b > 0) ? 1 : 0;
        int z = (c > 0) ? 1 : 0;
        int plus = x + y + z;

        int x1 = (a < 0) ? 1 : 0;
        int y1 = (b < 0) ? 1 : 0;
        int z1 = (c < 0) ? 1 : 0;
        int minus = x1 + y1 + z1;

        System.out.println("Количество положительных чисел: " + plus);
        System.out.println("Количество отрицательных чисел: " + minus);



    }
}
