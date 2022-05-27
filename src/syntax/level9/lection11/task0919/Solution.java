package syntax.level9.lection11.task0919;

public class Solution {
    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void divideByZero() {
        System.out.println(10/0);
    }
}
