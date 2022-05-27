package syntax.level9.lection6.task0909;

public class Solution {
    public static void main(String[] args) {
        int[] m = new int[2];
        try {
            m[8] = 5;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
