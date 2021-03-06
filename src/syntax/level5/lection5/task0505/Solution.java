package syntax.level5.lection5.task0505;
//Кошачья бойня
public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", 4, 5, 9);
        Cat cat2 = new Cat("Barsik", 5, 7, 8);
        Cat cat3 = new Cat("Murzik", 4, 6, 10);

        System.out.println(cat1.fight(cat2) + " Vaska + Barsik");
        System.out.println(cat1.fight(cat3) + " Vaska + Murzik");
        System.out.println(cat2.fight(cat3) + " Barsik + Murzik");

    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // score > 0 ? true : false;
        }
    }
}
