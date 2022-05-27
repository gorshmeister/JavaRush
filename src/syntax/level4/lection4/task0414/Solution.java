package syntax.level4.lection4.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Vvedi god: ");
        String number = reader.readLine();
        int num = Integer.parseInt(number);

        if (num % 400 == 0)
            System.out.println("366");
        else if (num % 100 == 0)
            System.out.println("365");
        else if (num % 4 == 0)
            System.out.println("366");
        else
            System.out.println("365");
    }
}
