package syntax.level6.lection5.task0604;

public class Cat {
    public Cat() {
        catCount++;
    }

    public static int catCount = 0;

    @Override
    protected void finalize() throws Throwable {
        catCount--;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1_000_000; i++) {
            Cat cat = new Cat();
        }
        System.out.println(catCount);

    }
}
