package syntax.level3.task0328;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsNumber(546));
    }

    public static int sumDigitsNumber(int num) {
        int sum = (num / 100) + (num % 100 / 10) + (num % 10);
        return sum;
    }
}
