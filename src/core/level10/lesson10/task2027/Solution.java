package core.level10.lesson10.task2027;

/*
Кроссворд
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        System.out.println(detectAllWords(crossword, "home", "same"));
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        List<Word> list = new ArrayList<>();

        for (String word : words) { //берем одно слово

            char[] chars = word.toCharArray(); //переводим его в массив символов

            for (int i = 0; i < crossword.length; i++)
                for (int j = 0; j < crossword[i].length; j++)
                    if (chars[0] == crossword[i][j]) {
                        list.add(check(crossword, chars, i, j, -1, 0));
                        if (word.length() == 1)
                            continue;
                        list.add(check(crossword, chars, i, j, 0, 1));
                        list.add(check(crossword, chars, i, j, 0, -1));
                        list.add(check(crossword, chars, i, j, 1, 0));
                        list.add(check(crossword, chars, i, j, -1, -1));
                        list.add(check(crossword, chars, i, j, -1, 1));
                        list.add(check(crossword, chars, i, j, 1, -1));
                        list.add(check(crossword, chars, i, j, 1, 1));
                        list.removeIf(Objects::isNull);
                    }
        }
        return list;
    }

    public static Word check(int[][] crossword, char[] chars, int startX, int startY, int x, int y) {
        int endX = startX;
        int endY = startY;
        try {
            for (int i = 1; i < chars.length; i++)
                if (chars[i] == crossword[endX = startX + (i * x)][endY = startY + (i * y)])
                    return null;
        } catch (Exception e) {
            return null;
        }
        Word find = new Word(new String(chars));
        find.setStartPoint(startY, startX);
        find.setEndPoint(endY, endX);

        return find;
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}