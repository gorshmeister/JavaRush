package syntax.level4.lection7.task0427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int x = Integer.parseInt(s);

        if (x % 2 == 0) {
            if (s.length() == 3) {
                System.out.println("Четное трехзначное число");
            } else if (s.length() == 2) {
                System.out.println("Четное двухзначное число");
            } else
                System.out.println("Четное однозначное число");
        } else {
            if (s.length() == 3) {
                System.out.println("Нечетное трехзначное число");
            } else if (s.length() == 2) {
                System.out.println("Нечетное двухзначное число");
            } else
                System.out.println("Нечетное однозначное число");
        }

//        System.out.println(s.length());
    }
}
