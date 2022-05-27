package syntax.level3.task0303;

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(19, 1.15));
        System.out.println(convertEurToUsd(132, 1.15));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        return eur * exchangeRate;
    }
}
