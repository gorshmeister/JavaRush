package core.level10.lesson10.task2026;

/*
Алгоритмы-прямоугольники
*/

public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] a) {
        int out = 0;
        for (int i = 0; i < a.length; i++) { // строка
            for (int j = 0; j < a[i].length ; j++) { //столбец

                if (a[i][j] == 1) {
                    int length = 0, jj = j;
                    int width = 0, ii = i;
                    int count = 0;

                    try {
                        while (a[i][jj] != 0) {
                            jj++;
                            length = jj;
                        }
                    } catch (Exception e) {
                    }
                    try {
                        while (a[ii][j] != 0) {
                            ii++;
                            width = ii;
                        }
                    } catch (Exception e) {
                    }
                    int S = length * width;
                    for (int k = 0; k < width; k++) {
                        for (int l = 0; l < length; l++) {
                            if (a[k][l] == 1) {
                                count++;
                                a[k][l]++;
                            }
                        }
                    }
                    if (count == 1 || count == S)
                        out++;
                }
            }
        }
        return out;
    }
}