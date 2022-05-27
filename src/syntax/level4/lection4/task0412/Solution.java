package syntax.level4.lection4.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int num = Integer.parseInt(number);

        if (num > 0)
            num = num * 2;
        else if (num < 0)
            num = num + 1;
        else
            num = num;
        System.out.println(num);
    }
}
