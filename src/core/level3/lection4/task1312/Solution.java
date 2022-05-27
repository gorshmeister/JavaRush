package core.level3.lection4.task1312;

public class Solution {
    public static void main(String[] args) {
        Translator translator = new Translator();
        System.out.println(translator.translate());
    }

    public static class Translator {
        public String translate() {
            return "Я переводчик с английского";
        }
    }
}
