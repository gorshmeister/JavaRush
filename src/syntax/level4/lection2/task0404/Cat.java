package syntax.level4.lection2.task0404;

/*
Учет котов
*/

public class Cat {
    private static int catsCount = 0;

    public static void addNewCat() {
        //напишите тут ваш код
        Cat cat = new Cat();
        catsCount++;
    }

    public static void main(String[] args) {
        addNewCat();
        System.out.println(catsCount);
    }
}
