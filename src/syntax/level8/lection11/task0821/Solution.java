package syntax.level8.lection11.task0821;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> people = new HashMap<>();
        people.put("Машков", "Дениска");
        people.put("Машков1", "Диса");
        people.put("Машков2", "Денис");
        people.put("Машков3", "Демикс");
        people.put("Машков4", "Денчис");
        people.put("Машков5", "Демис");
        people.put("Машков6", "Ден");
        people.put("Машков7", "Денис");
        people.put("Машков", "Денис");
        people.put("Машков", "Ден");

        return people;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
