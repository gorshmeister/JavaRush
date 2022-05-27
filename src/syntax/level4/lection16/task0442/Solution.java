package syntax.level4.lection16.task0442;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        while (true) {
            int x = Integer.parseInt(reader.readLine());
            if (x == -1) {
                break;
            } else {
                cnt += x;
            }
        }
        System.out.println(cnt);
    }
}
