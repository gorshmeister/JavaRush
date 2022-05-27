package syntax.level6.lection8.task0608;

public class Cat {
    static int catCount;

    public Cat() {
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public static void setCatCount(int catCount) {
        Cat.catCount = catCount;
    }


    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(catCount);

        setCatCount(10);
        getCatCount();
        System.out.println(catCount);
    }
}
