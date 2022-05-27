package syntax.level6.lection5.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            String n = reader.readLine();
            int num = Integer.parseInt(n);
            int signs = n.length();

            if (num > 0) {
                while (signs != 0) {
                    if ((num % 10) % 2 == 0) {
                        even++;
                    } else
                        odd++;

                    num /= 10;
                    signs--;
                }
                break;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
