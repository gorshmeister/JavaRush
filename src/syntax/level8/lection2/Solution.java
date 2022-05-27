package syntax.level8.lection2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Stop");
        set.add("Look");
        set.add("Listen");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String text = iterator.next();
            System.out.println(text);
        }
    }
}
