package syntax.level7.lection9.task0715;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "мама", "мыла", "раму");

        for (int i = list.size(); i > 0 ; i--) {
            list.add(i, "именно");
        }
/*

        list.add(1, "именно");
        list.add(3, "именно");
        list.add(5, "именно");
*/

        System.out.println(list.toString());

    }
}
