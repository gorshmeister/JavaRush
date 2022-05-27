package syntax.level10.lection11.task1016;

/*
Одинаковые слова в списке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

//        //напишите тут ваш код
//        int cnt;
//        for (String s1 : list) {
//            cnt = 0;
//            for (String s : list) {
//                if (s1.compareToIgnoreCase(s) == 0) {
//                    cnt++;
//                }
//                result.put(s1.toLowerCase(), cnt);
//            }
//        }
        for (String s : list)
            result.put(s, Collections.frequency(list, s));


        return result;
    }

}
