package syntax.level4.lection4.task0411;

/*
Время года
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        if (month >= 9 && month <= 11)
            System.out.println("Osen");
        else if (month >= 3 && month <= 5)
            System.out.println("Vesna");
        else if (month >= 6 && month <= 8)
            System.out.println("Leto");
        else
            System.out.println("Zima");
    }
}