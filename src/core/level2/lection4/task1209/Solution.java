package core.level2.lection4.task1209;

public class Solution {
    public static void main(String[] args) {
        System.out.println(min(10, 15));
        System.out.println(min(10L, 1555L));
        System.out.println(min(10.101010d, 15.555d));
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static long min(long a, long b) {
        return Math.min(a, b);
    }

    public static double min(double a, double b) {
        return Math.min(a, b);
    }
}
