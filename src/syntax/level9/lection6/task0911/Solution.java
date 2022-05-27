package syntax.level9.lection6.task0911;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        HashMap<String, String> map = null;
        try {
            map = new HashMap<>(null);

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        try {
            map.put(null, null);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }

        try {
            map.remove(null);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
    }
}
