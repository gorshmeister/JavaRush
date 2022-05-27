package syntax.level6.lection8.task0605;
/*
Контролируем массу тела
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            // напишите тут ваш код
            double calc = weight / (height * height);

            if (calc < 18.5) {
                System.out.println("Недовес");
            } else if (calc > 18.5 && calc < 25) {
                System.out.println("Нормалды");
            } else if (calc > 25 && calc < 30) {
                System.out.println("Избыточный");
            } else if (calc >= 30) {
                System.out.println("FatBoy");
            }
        }
    }
}
