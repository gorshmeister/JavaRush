package syntax.level7.lection4.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] house = new int[15];
        for (int i = 0; i < house.length; i++) {
            house[i] = Integer.parseInt(reader.readLine());
        }

        int even = 0, odd = 0;

        for (int i = 0; i < house.length; i++) {
            if (i % 2 == 0) {
                even += house[i];
            } else {
                odd += house[i];
            }
        }

        System.out.println(even > odd ? "В домах с четными номерами проживает больше жителей! " + even + " : " + odd :
                "В домах с нечетными номерами проживает больше жителей! " + odd + " : " + even);
    }
}
