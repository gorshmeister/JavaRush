package syntax.level5.lection9.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0, min = 0;
        while (true) {
            int num = Integer.parseInt(reader.readLine());
            cnt++;

            if (cnt == 1) {
                min = num;
            } else {
                min = Math.min(min, num);
            }

            if (cnt == 5) {
                System.out.println("Minimum = " + min);
                break;
            }

        }
    }

}
