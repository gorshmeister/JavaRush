package syntax.level7.lection9.task0716;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("роза");
        strings.add("лира");
        strings.add("лоза");

        strings = fix(strings);

        for (String str : strings) {
            System.out.println(str);
        }

/*
        for (int i = 0; i < strings.size(); i++) {
            String str = strings.get(i);
            System.out.println(str);
        }
*/

    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); ) {

            if (strings.get(i).contains("л") && strings.get(i).contains("р")) {
                i++;
            } else if (strings.get(i).contains("л")) {
                strings.add(i, strings.get(i));
                i += 2;
            }
            else if (strings.get(i).contains("р")) {
                strings.remove(i);
            }
        }
        return strings;
    }
}
