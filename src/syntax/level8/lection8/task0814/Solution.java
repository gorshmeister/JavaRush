package syntax.level8.lection8.task0814;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        while (set.size() < 20) {
            set.add((int) (Math.random() * 30));
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        int n = 0;
        set.removeIf(x -> x > 10);
        return set;
    }

    public static void main(String[] args) {
        System.out.println(removeAllNumbersGreaterThan10(createSet()));
    }
}
