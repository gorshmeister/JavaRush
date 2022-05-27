package syntax.level5.lection5.task0507;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        float sum = 0;
        while (true) {
            int x = Integer.parseInt(reader.readLine());
            if (x == -1) {
                System.out.println(sum / cnt);
                break;
            }
            sum += x;
            cnt++;
        }
    }
}
