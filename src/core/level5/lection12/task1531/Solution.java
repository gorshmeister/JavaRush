package core.level5.lection12.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        if (n < 0)
            return String.valueOf(0);

        BigInteger value = BigInteger.valueOf(1);
        for (int i = 1; i <= n ; i++) {
            value = value.multiply(BigInteger.valueOf(i));
        }

        return String.valueOf(value);
    }
}
