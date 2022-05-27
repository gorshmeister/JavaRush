package syntax.level4.lection7.task0428;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int z = Integer.parseInt(c);

        int cnt = 0;
        int[] arr = {x, y, z};
        for (int i = 0; i < 3; i++) {
            if (arr[i] > 0)
                cnt++;
        }
        System.out.println(cnt);
    }
}
