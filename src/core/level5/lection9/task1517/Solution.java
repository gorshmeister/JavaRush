package core.level5.lection9.task1517;

public class Solution {
    public static int A = 0;

    static {
        if ( true) throw new RuntimeException("");

    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
