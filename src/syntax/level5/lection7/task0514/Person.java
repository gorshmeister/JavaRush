package syntax.level5.lection7.task0514;

public class Person {
    String name;
    int age;

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Olejka", 21);
    }
}
