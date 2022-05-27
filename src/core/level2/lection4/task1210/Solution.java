package core.level2.lection4.task1210;

public class Solution {
    public static void main(String[] args) {
        System.out.println(max(1, 2));
        System.out.println(max(111L, 222L));
        System.out.println(max(111.111d, 222.222d));
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static long max(long a, long b) {
        return Math.max(a, b);
    }

    public static double max(double a, double b) {
        return Math.max(a, b);
    }
}
