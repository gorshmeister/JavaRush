package syntax.level5.lection9.task0529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while (true) {
            String s = reader.readLine();
            if (s.equals("сумма")) {
                System.out.println(sum);
                break;
            }
            int num = Integer.parseInt(s);
            sum += num;
        }
    }
}
