package syntax.level4.lection16.task0441;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int max = Math.max(a, b);
        int max1 = Math.max(a, c);
        int max2 = Math.max(max, max1);

        int min = Math.min(a, b);
        int min1 = Math.min(a, c);
        int min2 = Math.min(min, min1);

        int ave = max2 == a && min2 == b ? c : max2 == a && min2 == c ? b :
                max2 == b && min2 == c ? a : max2 == b && min2 == a ? c :
                max2 == c && min2 == a ? b : max2 == c && min2 == b ? a : 0;
        System.out.println(ave);
    }
}
