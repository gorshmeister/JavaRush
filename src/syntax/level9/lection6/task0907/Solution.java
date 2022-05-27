package syntax.level9.lection6.task0907;

public class Solution {
    public static void main(String[] args) {
        try {
            int a = 42 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
