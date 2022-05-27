package syntax.level10.lection4.task1001;

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = (byte) a + 46;
        byte c = (byte) (a * b);
        double f = (char) 1234.15;
        long d = (char) (a + f / c + b);
        System.out.println(d);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(f);

    }
}
