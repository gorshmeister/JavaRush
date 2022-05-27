package syntax.level9.lection11.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        for (char c : text.toCharArray()) {
            if (isVowel(c)) {
                System.out.print(c);
                System.out.print(" ");
            }
        }
        System.out.println();
        for (char c : text.toCharArray()) {
            if (!isVowel(c) && (c != ' ')) {
                System.out.print(c);
                System.out.print(" ");
            }
        }
    }


    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}