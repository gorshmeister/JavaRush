package syntax.level3.task0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Скромность
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Name: ");
        String name = buf.readLine();

        System.out.println(name + " зарабатывает $5000. Ха-ха-ха");
    }
}