package syntax.level4.lection6.task0421;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();

        if (s1.equals(s2))
            System.out.println("Имена одинаковые");
        else if (!(s1.equals(s2))) {
            if (s1.length() == s2.length()) {
                System.out.println("Длины имен равны");
            }
        }


    }
}
