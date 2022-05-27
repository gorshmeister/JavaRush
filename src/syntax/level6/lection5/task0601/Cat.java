package syntax.level6.lection5.task0601;

public class Cat {
    String name;

    Cat(String name) {
        this.name = name;
    }

    protected void finalize() throws Throwable {
        System.out.println(name + " destroyed");
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Boris");

    }
}
