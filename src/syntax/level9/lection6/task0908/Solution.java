package syntax.level9.lection6.task0908;

public class Solution {
    public static void main(String[] args) {
        String s = null;
        try {
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }
}
