package syntax.level4.lection6.task0422;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int x = Integer.parseInt(s2);

        if (x < 18)
            System.out.println("Подрасти еще, сынок!");
    }
}
