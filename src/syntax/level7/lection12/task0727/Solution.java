package syntax.level7.lection12.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

        ArrayList<String> resultStrings = new ArrayList<String>();
        for (int i = 0; i < strings.size(); i++) {
            String string = strings.get(i);
            if (strings.get(i).length() % 2 == 0) {
                for (int j = 0; j < 2; j++) {
                    resultStrings.add(string);
                }
            } else {
                for (int j = 0; j < 3; j++) {
                    resultStrings.add(string);
                }
            }
        }

        System.out.println(resultStrings);
        /*
        for (int i = 0; i < resultStrings.size(); i++) {
            System.out.println(resultStrings.get(i));
        }
        */

    }
}