package syntax.level3.task0315;

public class Solution {
    public static void main(String[] args) {
    /*
        1 2 3 4 5   6  7 8  9 10
        2 4 6 8 10 12 14 16 18 20
    */
        int[][] Arr = new int[10][10];

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                Arr[row][col] = (row + 1) * (col + 1);
            }
        }
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                System.out.print(Arr[row][col] + "\t");
            }
            System.out.println();
        }
    }
}

