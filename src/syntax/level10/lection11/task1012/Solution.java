//package syntax.level10.lection11.task1012;
//
///*
//Количество букв
//*/
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        // Алфавит
//        List<Character> alphabet = Arrays.asList(
//                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
//                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
//                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
//                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');
//
//        // Ввод строк
//        ArrayList<String> list = new ArrayList<String>();
//        for (int i = 0; i < 2; i++) {
//            String line = reader.readLine();
//            list.add(line.toLowerCase());
//        }
//
//        for (Character x : alphabet) {
//            int cnt = 0;
//            for (String s : list) {
//                for (int i = 0; i < s.length(); i++) {
//                    if(s.charAt(i) == x)
//                        cnt++;
//                }
//            }
//            System.out.println(x + " " + cnt);
//        }
//
////        List<Integer> alphaCount = new ArrayList<>();
////        for (int i = 0; i < alphabet.size(); i++) {
////            alphaCount.add(0);
////        }
////
////        int cnt = 0;
////        for (String s : list) { //Строка / строка < длины строки
////
////            for (int letter = 0; letter < alphabet.size(); letter++) { //Буква / буква < длины алфавита
////
////                cnt = 0;
////                while (cnt != s.length()) {
////                    if (s.charAt(cnt) == ' ') {
////                        cnt++;
////                    } else if (alphabet.get(letter) == s.charAt(cnt)) {
////                        alphaCount.set(letter, alphaCount.get(letter) + 1);
////                        cnt++;
////
////                    } else cnt++;
////                }
////            }
////        }
////
////        for (int i = 0; i < alphabet.size(); i++) {
////            System.out.println(alphabet.get(i) + " " + alphaCount.get(i));
////        }
//
//        // напишите тут ваш код
//    }
//}
