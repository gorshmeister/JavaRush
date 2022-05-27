package syntax.level4.lection10.task0434;

public class Solution {
    public static void main(String[] args) {
        int i = 0, j = 0;
        while (i < 10) {
            j = 0;
            while (j < 10) {
                System.out.print((i + 1) * (j + 1));
                System.out.print("\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
