package syntax.level4.lection4.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        float num = Float.parseFloat(number);


        if (num % 5 < 3) {
            System.out.println("Green");
        }
        else if (num % 5 < 4) {
            System.out.println("Yellow");
        }
        else if (num % 5 < 5)
            System.out.println("Red");


    }
}
