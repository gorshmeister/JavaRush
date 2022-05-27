package syntax.level4.lection2.task0405;

public class Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
//        kod
        Cat.catsCount = catsCount;
    }

    public static void main(String[] args) {
        setCatsCount(10);
        System.out.println(catsCount);

    }
}
