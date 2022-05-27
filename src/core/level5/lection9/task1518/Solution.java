package core.level5.lection9.task1518;

public class Solution {
    public static Cat cat;

    public static class Cat {
        public String name;
    }

    static {
        Cat cat = new Cat();
        cat.name = "Viktor";
        System.out.println(cat.name);
    }

    public static void main(String[] args) {

    }
}
