package syntax.shell;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] array = new int[9999];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }

        System.out.println(Arrays.toString(array));
        System.out.println();

        shellSortWiki(array);
        shellSort(array);
        bubbleSort(array);
    }

    public static void shellSortWiki(int[] array) {
        int n = array.length;

        long start = System.currentTimeMillis(); //

        for (int step = n / 2; step > 0; step /= 2) {
            for (int i = step; i < n; i++) {
                for (int j = i - step; j >= 0 && array[j] > array[j + step] ; j -= step) {
                    int x = array[j];
                    array[j] = array[j + step];
                    array[j + step] = x;
                }
            }
        }

        long end = System.currentTimeMillis(); //

        System.out.println(Arrays.toString(array));
        System.out.println("ShellSortWiki: " + (end - start) + " ms.");
    }

    public static void shellSort(int[] array) {
        int delimiter = array.length / 2;
        int j, tmp;

        long start = System.currentTimeMillis(); //

        while (delimiter > 0) {
            for (int i = 0; i < array.length - delimiter; i++) {
                j = i;
                while (j >= 0 && array[j] > array[j + delimiter]) {
                    tmp = array[j];
                    array[j] = array[j + delimiter];
                    array[j + delimiter] = tmp;

                    j--;
                }
            }
            delimiter = delimiter / 2;
        }

        long end = System.currentTimeMillis(); //

        System.out.println(Arrays.toString(array));
        System.out.println("ShellSort: " + (end - start) + " ms.");
    }

    public static void bubbleSort(int[] array) {
        int tmp;

        long start = System.currentTimeMillis(); //

        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length - 1; k++) {
                if (array[i] > array[k]) {
                    tmp = array[i];
                    array[i] = array[k];
                    array[k] = tmp;
                }
            }
        }

        long end = System.currentTimeMillis(); //

        System.out.println(Arrays.toString(array));
        System.out.println("BubbleSort: " + (end - start) + " ms.");
    }
}
