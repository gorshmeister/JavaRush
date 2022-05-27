package syntax.level4.lection6.task0418;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);

//        System.out.println(a < b ? a : b);
        if (a1.equals(b1) || a < b) {
            System.out.println(a);
        } else
            System.out.println(b);
    }
}
