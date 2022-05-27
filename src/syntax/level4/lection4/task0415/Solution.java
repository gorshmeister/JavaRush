package syntax.level4.lection4.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        String c1 = reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);
        validTriang(a, b, c);
    }

    public static void validTriang(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a )
            System.out.println("Треугольник существует");
        else
            System.out.println("Треугольник не существует");
    }
}
