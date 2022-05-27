package core.level5.lection12.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //напишите тут ваш код
//        http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
//        http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
        url = url.substring(url.indexOf("?")).substring(1);
        String[] words1 = url.split("&");

        ArrayList<String> obj = new ArrayList<>();
        ArrayList<String> obj2 = new ArrayList<>();

        for (String s : words1) {
            if (s.contains("=")) {
                obj.add(s.substring(0, s.indexOf("=")));

                if (s.contains(".")) {
                    obj2.add(s.substring(s.indexOf("=")).substring(1));
                }
            } else {
                obj.add(s);
            }
        }
        for (String value : obj) {
            alert(value);
        }

        for (String value : obj2) {
            alert(Double.parseDouble(value));
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}





