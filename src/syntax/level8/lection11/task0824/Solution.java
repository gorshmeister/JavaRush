package syntax.level8.lection11.task0824;

import java.util.ArrayList;
import java.util.Arrays;

/*
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human children1 = new Human("Son1", true, 12);
        Human children2 = new Human("Son2", true, 12);
        Human children3 = new Human("Daughter", false, 12);
        Human mother = new Human("Mother", false, 33, children1, children2, children3);
        Human father = new Human("Father", true, 36, children1, children2, children3);
        Human grandfather1 = new Human("Максим",true,87, father);
        Human grandfather2 = new Human("Федор", true, 88, mother);
        Human grandma1 = new Human("GrandMother", false, 88, father);
        Human grandma2 = new Human("GrandMother", false, 88, mother);

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, Human...human) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>(Arrays.asList(human));
            System.out.println(this.toString());
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
