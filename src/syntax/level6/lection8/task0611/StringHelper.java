package syntax.level6.lection8.task0611;

/*
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String text) {
        String result = "";
        //напишите тут ваш код
        result = text + text + text + text + text;
        return result;
    }

    public static String multiply(String text, int count) {
        String result = "";
        //напишите тут ваш код
        for (int i = 0; i < count; i++) {
            result += text;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply("Amigo"));
        System.out.println(multiply("Pidor", 15));

    }
}




