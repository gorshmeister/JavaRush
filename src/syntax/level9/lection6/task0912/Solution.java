package syntax.level9.lection6.task0912;

public class Solution {
    public static void main(String[] args) {
        int num = 0;
        try {
            num = Integer.parseInt("XYZ");
        } catch (NumberFormatException e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
        System.out.println(num);
    }
}
