package syntax.level3.task0327;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число: ");
        String s = reader.readLine();
        System.out.println("Я буду зарабатывать $" + s + " долларов в час");
    }
}
