package syntax.level4.lection6.task0419;
// max iz 4 cifr
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        String c1 = reader.readLine();
        String d1 = reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);
        int d = Integer.parseInt(d1);

        int max = 0, max1 = 0;
        max = Math.max(a, b);
        max1 = Math.max(c, d);
        System.out.println(Math.max(max, max1));

    }
}
