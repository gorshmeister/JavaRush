package syntax.level3.task0309;
/*
Сумма 5 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        /*
        1
        1+2 = 3
        1+2+3 = 6
        1+2+3+4 = 10
        1+2+3+4+5 = 15
         */
        int result = 0;
        for (int i = 1; i <= 5; i++)
        {
            result += i;
            System.out.println(result);
        }
    }

}
