package syntax.level7.lection12.task0724;

public class Solution {
    public static void main(String[] args) {
        Human ded1 = new Human("Дед Максим", true, 78);
        Human ded2 = new Human("Дед Агафон", true, 89);
        Human babka1 = new Human("Баба Глаша", false, 66);
        Human babka2 = new Human("Баба Зина", false, 72);
        Human otec = new Human("Павел", true, 43, ded1, babka1);
        Human mama = new Human("Катя", false, 38, ded2, babka2);
        Human son1 = new Human("Вова", true, 13, otec, mama);
        Human son2 = new Human("Никита", true, 15, otec, mama);
        Human do4a = new Human("Маша", false, 12, otec, mama);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(babka1);
        System.out.println(babka2);
        System.out.println(otec);
        System.out.println(mama);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(do4a);
    }

    public static class Human {

        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this(name, sex, age);
            this.father = father;
            this.mother = mother;
        }

        public String toString(){
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "man" : "woman");
            text += ", age: " + this.age;
            if (this.father != null) {
                text += ", father: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", mother: " + this.mother.name;
            }

            return text;
        }
    }

}
