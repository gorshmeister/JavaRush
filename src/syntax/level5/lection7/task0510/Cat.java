package syntax.level5.lection7.task0510;

import java.text.DecimalFormat;

/*
    Имя
    Имя. возраст. вес
    имя. возраст (вес станд.)
    вес. цвет (имя нул. адрес нул. возраст станд)
    вес. цвет. адрес (чужой домашний кот)
*/

public class Cat {

    String name;
    float age;
    float weight;
    String color;
    String address;

    public void initialize(String name) {
        this.name = name;
        this.age = RandomAge();
        this.weight = RandomWeigh();
        this.color = RandomColor();
        this.address = null;

    }

    public void initialize(String name, float age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = RandomColor();
        this.address = null;
    }

    public void initialize(String name, float age) {
        this.name = name;
        this.age = age;
        this.weight = RandomWeigh();
        this.color = RandomColor();
        this.address = null;
    }

    public void initialize(float weight, String color) {
        this.name = null;
        this.age = RandomAge();
        this.weight = weight;
        this.color = color;
        this.address = null;
    }

    public void initialize(float weight, String color, String address) {
        this.name = null;
        this.age = RandomAge();
        this.weight = weight;
        this.color = color;
        this.address = address;
    }


    public static float RandomWeigh() {
        //Рандом для веса

        int minW = 2, maxW = 12;
        float weightRandom;
        weightRandom = (float) ((Math.random() * (maxW - minW) + 1) + minW);
        //System.out.printf("Рандомный вес = %.1f",weightRandom);
        return weightRandom;
    }

    public static float RandomAge() {
        //Рандом для возраста

        int minA = 1, maxA = 15;
        float ageRandom;
        ageRandom = (float) ((Math.random() * (maxA - minA) + 1) + minA);
        //System.out.printf("Рандомный возраст = %.1f",ageRandom);
        return ageRandom;
    }

    public static String RandomColor() {
        //Рандом для цвета

        String[] colorPalette = {"Каштан", "Серый", "Черный", "Рыжий", "Белый", "Тигр",
                "Бенгал", "Дымчатый", "Коричневый", "Шоколадный", "Голубой",
                "Черепаховый", "Шампанское", "Кремовый", "Бежевый"};

        int colorLength = colorPalette.length; // Определяем длину массива цветов

        int colorRandom = (int) (Math.random() * colorLength);  // Выбираем рандомный цвет

        //colorPalette[colorRandom];  вывод рандомного цвета

        return colorPalette[colorRandom];
    }

    static DecimalFormat dF = new DecimalFormat("##.#");


    public static void main(String[] args) {

        float weight = RandomWeigh();
        System.out.println(dF.format(weight));

        float age = RandomAge();
        System.out.println(dF.format(age));

        String color = RandomColor();
        System.out.println(color);
    }
}
