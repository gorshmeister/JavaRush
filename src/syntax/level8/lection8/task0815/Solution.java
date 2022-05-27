package syntax.level8.lection8.task0815;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Alexander", "Gorshenev");
        map.put("Pasha", "Durov");
        map.put("Denis", "Borisov");
        map.put("Matvei", "Kirow");
        map.put("Nikita", "Lisenkov");
        map.put("Dmitiy", "Zhirnov");
        map.put("Deniska", "Mashkov");
        map.put("Artur", "Sibagatulin");
        map.put("Olegsey", "Kolesnikov");
        map.put("Sasha", "Pakulev");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int cnt = 0;
        for (String s : map.keySet() ) {
            if (s.equals(name)) {
                cnt++;
            }
        }
        return cnt;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastname) {
        int cnt = 0;
        for (String s : map.values()) {
            if (s.equals(lastname)) {
                cnt++;
            }
        }
        return cnt;

    }

    public static void main(String[] args) {
        System.out.println(getCountTheSameFirstName(createMap(), "Pasha"));
        System.out.println(getCountTheSameLastName(createMap(), "Mashkov"));
    }
}
