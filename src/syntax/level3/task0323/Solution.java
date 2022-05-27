package syntax.level3.task0323;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Man`: ");
        String man = reader.readLine();
        System.out.print("Girl1: ");
        String girl1 = reader.readLine();
        System.out.print("Girl2: ");
        String girl2 = reader.readLine();

        System.out.println(man + " + " + girl1 + " + " + girl2 + " = Чистая любовь, да-да!");
    }
}
