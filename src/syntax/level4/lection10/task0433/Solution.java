package syntax.level4.lection10.task0433;

public class Solution {
    public static void main(String[] args) {
        int i = 0, j = 0;

        while (i < 10) {
            while (j < 10) {
                System.out.print("S");
                j++;
            }
            j = 0;
            System.out.println();
            i++;
        }
    }
}
