package syntax.level8.lection11.task0819;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //step3
        cats.removeIf(s -> cats.size() > 2);

        /*Iterator<Cat> iterator = cats.iterator();

        while (iterator.hasNext()) {
            Cat x = iterator.next();
            if (cats.size() > 2)
                iterator.remove();
        }
*/
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //step2
        Set<Cat> cats = new HashSet<>();
        while (cats.size() < 3)
            cats.add(new Cat((int) (Math.random() * 100)));
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        //step4
        for (Cat x : cats) {
            System.out.println(x);
        }
    }

    public static class Cat {
        //step1
        int id;

        public Cat(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "id=" + id +
                    '}';
        }
    }
}
