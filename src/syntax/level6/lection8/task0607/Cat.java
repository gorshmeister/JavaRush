package syntax.level6.lection8.task0607;

public class Cat {
    static int catCount;

    public Cat() {
        catCount++;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(catCount);
    }
}
