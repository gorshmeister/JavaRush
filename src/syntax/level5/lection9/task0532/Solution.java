package syntax.level5.lection9.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Совершенствуем функциональность max
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int limit = 0;
        while (!(limit > 0)) {
            System.out.print("Введите положительное число: ");
            limit = Integer.parseInt(reader.readLine());
        }

        int cnt = 0, max = 0;
        while (true) {
            System.out.println("Введите " + (cnt + 1) + "-е число");
            int num = Integer.parseInt(reader.readLine());
            cnt++;

            if (cnt == 1) {
                max = num;
            } else {
                max = Math.max(max, num);
            }

            if (cnt == limit) {
                System.out.println("Maximum = " + max);
                break;
            }

        }
    }

}
