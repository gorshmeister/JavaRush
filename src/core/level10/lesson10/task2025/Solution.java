package core.level10.lesson10.task2025;

/*
Алгоритмы-числа
*/

import java.util.Arrays;

public class Solution {

    public static long[] getNumbers(long N) {
        int Nlength = String.valueOf(N).length();
        if (Nlength >= 21) throw new IllegalArgumentException();

        long[] result = new long[(int) N];

        int numLength; // колво цифр
        int sum; // сумма
        long degree; //степень
        long copy;

        for (int i = 1; i < result.length; i++) {
            copy = i;
            sum = 0;
            numLength = 0;

            while (copy > 0) { //определили колво цифр
                copy = copy / 10;
                numLength++;
            }

            copy = i;
            long oneDigit;
            for (int j = numLength; j > 0; j--) {

                oneDigit = copy % 10; //взяли последнее число
                degree = oneDigit;

                for (int k = numLength; k > 1; k--) { // возводим его в степень и записываем в сумму
                    degree = degree * oneDigit;
                }
                sum += degree;

                copy = copy / 10;
            }

            if (sum == i) {
                result[i]++;
            }
        }

        int cnt = 0; //кол во чисел вывода
        for (long l : result) {
            if (l == 1)
                cnt++;
        }
        long[] finish = new long[cnt];
        for (int i = 0; i < finish.length; ) {
            for (int j = 0; j < result.length; j++) {
                if (result[j] == 1) {
                    finish[i] = j;
                    i++;
                }
            }
        }

        return finish;
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(100000000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}
