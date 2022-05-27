package syntax.level4.lection4.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int num = Integer.parseInt(number);

        if (num == 1)
            System.out.println("Monday");
        else if (num == 2)
            System.out.println("Tuesday");
        else if (num == 3)
            System.out.println("Wednesday");
        else if (num == 4)
            System.out.println("Thursday");
        else if (num == 5)
            System.out.println("Friday");
        else if (num == 6)
            System.out.println("Saturday");
        else if (num == 7)
            System.out.println("Sunday");
        else
            System.out.println("Net takogo");
// mojno switch + scanner
    }
}
