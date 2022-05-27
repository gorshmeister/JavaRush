package syntax.level8.lection8.task0818;

import java.util.*;

/*
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Gorsh", 1000);
        map.put("Gorsh1", 1000);
        map.put("Gorsh2", 100);
        map.put("Gorsh3", 500);
        map.put("Gorsh4", 499);
        map.put("Gorsh5", 450);
        map.put("Gorsh6", 750);
        map.put("Gorsh7", 400);
        map.put("Gorsh8", 1000);
        map.put("Gorsh9", 10000);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        map.values().removeIf(s -> s < 500);

    }

    public static void main(String[] args) {
        Map<String, Integer> map = createMap();
        removeItemFromMap(map);
        System.out.println(map);
    }
}