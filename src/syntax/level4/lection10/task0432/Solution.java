package syntax.level4.lection10.task0432;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int x = Integer.parseInt(reader.readLine());
        int i = 0;

        while (i < x) {
            System.out.println(s);
            i++;
        }
    }
}
