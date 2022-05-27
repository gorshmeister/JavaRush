package core.level2.lection2.task1205;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
        System.out.println(getObjectType("н"));

    }

    public static String getObjectType(Object o) {
        String objectType = o.getClass().getSimpleName();
        return switch (objectType) {
            case ("Cow") -> "Корова";
            case ("Dog") -> "Собака";
            case ("Whale") -> "Кит";
            case ("Pig") -> "Свинюшка";
            default -> "Неизвестное животное";
        };

    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }

}
