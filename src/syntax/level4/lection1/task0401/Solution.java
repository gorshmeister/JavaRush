package syntax.level4.lection1.task0401;

/*
Мне не подходит этот возраст…
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted age is: " + person.age);
    }

    public static class Person {
        public int age = 20;

        void adjustAge(int age) {
            this.age = age + 20;
            System.out.println("Age in adjustAge() is: " + this.age);
        }
    }
}