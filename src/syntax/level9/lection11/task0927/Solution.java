package syntax.level9.lection11.task0927;

/*
Десять котов
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<>();
        map.put("kot1", new Cat("kot1"));
        map.put("kot11", new Cat("kot11"));
        map.put("kot12", new Cat("kot2"));
        map.put("kot13", new Cat("kot3"));
        map.put("kot14", new Cat("kot4"));
        map.put("kot15", new Cat("kot5"));
        map.put("kot16", new Cat("kot6"));
        map.put("kot17", new Cat("kot7"));
        map.put("kot18", new Cat("kot8"));
        map.put("kot19", new Cat("kot9"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        return new HashSet<>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}