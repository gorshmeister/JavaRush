package syntax.level8.lection8.task0817;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Машков", "Денис");
        map.put("Машков1", "Ден");
        map.put("Машков2", "Денис");
        map.put("Машков3", "Дениска");
        map.put("Машков4", "Денчис");
        map.put("Машков5", "Денисочка");
        map.put("Машков6", "Денисик");
        map.put("Машков7", "Демис");
        map.put("Машков8", "Денис");
        map.put("Машков9", "Денис");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, String> copy = new HashMap<>(map);
        HashSet<String> set = new HashSet<>();

        for (String name : copy.values()) {
            if (!set.add(name))
                removeItemFromMapByValue(map, name);
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        System.out.println(map);

    }
}
