package syntax.level5.lection9.task0530;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int cnt = 2;

        while (true) {
            int num = Integer.parseInt(reader.readLine());
            sum += num;
            cnt--;
            if (cnt == 0) {
                System.out.println("Sum: " + sum);
                break;
            }
        }
    }
}
