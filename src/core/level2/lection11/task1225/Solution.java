package core.level2.lection11.task1225;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));

    }

    public static String getObjectType(Object o) {
        String objectName = o.getClass().getSimpleName();
        return switch (objectName) {
            case ("Cat") -> "Кот";
            case ("Tiger") -> "Тигр";
            case ("Lion") -> "Лев";
            case ("Bull") -> "Бык";
            case ("Cow") -> "Корова";
            case ("Animal") -> "Животное";
            default -> "x3";
        };

    }

    public static class Cat extends Animal{

    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {

    }

    public static class Cow extends Animal {

    }

    public static class Animal {
    }

}
