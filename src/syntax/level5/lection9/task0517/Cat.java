package syntax.level5.lection9.task0517;

public class Cat {

    String name;
    int weight;
    int age;
    String color;
    String address;

    public Cat(String name) {
        this.name = name;
        this.weight = RandomWeight();
        this.age = RandomAge();
        this.color = RandomColor();
        this.address = null;
    }

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = RandomColor();
        this.address = null;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = RandomWeight();
        this.color = RandomColor();
        this.address = null;
    }

    public Cat(int age, String color) {
        this.name = null;
        this.weight = RandomWeight();
        this.age = age;
        this.color = color;
        this.address = null;
    }

    public Cat(int age, String color, String address) {
        this.name = null;
        this.weight = RandomWeight();
        this.age = age;
        this.color = color;
        this.address = address;
    }

    public static int RandomAge() {
        int min = 1, max = 15;
        float ageRandom = (float) ((Math.random() * (max - min) + 1) + min);
        return (int) Math.round(ageRandom);

    }

    public static int RandomWeight() {

        int min = 2, max = 12;
        float weightRandom = (float) ((Math.random() * (max - min) + 1) + min);
        return (int) Math.round(weightRandom);

    }

    public static String RandomColor() {
        String[] colorPalette = {"Рыжий", "Черный", "Тигр", "Белый", "Оранжевый с белым"};

        int colorLenght = colorPalette.length;

        int colorRandom = (int) (Math.random() * colorLenght);

        return colorPalette[colorRandom];
    }

    public static void main(String[] args) {

    }

}
