package syntax.level5.lection5.task0504;

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 4, 3, 8);
        Cat cat2 = new Cat("Tom", 2, 2, 6);
        Cat cat3 = new Cat("Moris", 3, 3, 7);

        System.out.println("Cat " + cat1.name + ". age - " + cat1.age + ". weight - " + cat1.weight + ". strength - " + cat1.strength);
        System.out.println("Cat " + cat2.name + ". age - " + cat2.age + ". weight - " + cat2.weight + ". strength - " + cat2.strength);
        System.out.println("Cat " + cat3.name + ". age - " + cat3.age + ". weight - " + cat3.weight + ". strength - " + cat3.strength);

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }

}
