package syntax.level10.lection11.task1020;

/*
Задача по алгоритмам Ӏ Java Syntax: 10 уровень, 11 лекция
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = (int) (Math.random() * 30) + 1;
        }

        sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        Arrays.sort(array);
    }
}
