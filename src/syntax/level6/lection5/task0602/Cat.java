package syntax.level6.lection5.task0602;

public class Cat {
    public static void main(String[] args) throws Throwable {
        Cat cat = new Cat();
        cat.finalize();
        Dog dog = new Dog();
        dog.finalize();


    }

    protected void finalize() throws Throwable {
        System.out.println("A cat was destroyed");
    }
}

class Dog {
    protected void finalize() throws Throwable {
        System.out.println("A dog was destroyed");
    }
}
