package syntax.level4.lection6.task0420;
// Числа по убыванию
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String A = reader.readLine();
        String B = reader.readLine();
        String C = reader.readLine();
        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);
        int c = Integer.parseInt(C);

        int ab = Math.max(a, b);
        int max = Math.max(ab, c);

        int am = Math.min(a, b);
        int min = Math.min(am, c);

        int mid = (a + b + c) - (max + min);

        System.out.println(max + " " + mid + " " + min);

    }
}
