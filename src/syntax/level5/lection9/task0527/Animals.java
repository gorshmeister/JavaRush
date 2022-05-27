package syntax.level5.lection9.task0527;

public class Animals {

    String name;
    String color;
    int height;
    int tail;

    public Animals(String name, String color, int height, int tail) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.tail = tail;
    }

    public static class Mouse extends Animals {

        public Mouse(String name, String color, int height, int tail) {
            super(name, color, height, tail);
        }
    }

    public static class Cat extends Animals {

        public Cat(String name, String color, int height, int tail) {
            super(name, color, height, tail);
        }
    }

    public static class Dog extends Animals {

        public Dog(String name, String color, int height, int tail) {
            super(name, color, height, tail);
        }
    }

    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", "Brown", 12, 5);
        Cat catTom = new Cat("Tom", "Blue", 48, 15);
        Dog dog = new Dog("Spike", "Grey", 54, 10);
    }
}