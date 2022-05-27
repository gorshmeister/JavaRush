package core.level2.lection2.task1204;

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
        printObjectType("X");
    }

    public static void printObjectType(Object o) {
        String objectClassName = o.getClass().getSimpleName();
        switch (objectClassName) {
            case ("Cat") -> System.out.println("Кошка");
            case ("Dog") -> System.out.println("Собака");
            case ("Bird") -> System.out.println("Птица");
            case ("Lamp") -> System.out.println("Лампа");
            default -> System.out.println("Такого класса нет");
        }
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }

}
