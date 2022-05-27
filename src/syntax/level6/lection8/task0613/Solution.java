package syntax.level6.lection8.task0613;

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
        }
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        public static int catCount;

        public Cat() {
            catCount++;
        }
    }
}
