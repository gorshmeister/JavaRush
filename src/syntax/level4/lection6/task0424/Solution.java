package syntax.level4.lection6.task0424;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();

        if (s1.equals(s2))
            System.out.println("3");
        else if (s1.equals(s3))
            System.out.println("2");
        else if (s2.equals(s3))
            System.out.println("1");
        else
            System.out.print("");
    }
}
