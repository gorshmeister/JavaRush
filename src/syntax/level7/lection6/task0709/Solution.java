package syntax.level7.lection6.task0709;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list1 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list1.add(reader.readLine());
        }

        int min = list1.get(0).length();
        for (int i = 1; i < list1.size(); i++) {
            if (list1.get(i).length() < min)
                min = list1.get(i).length();
        }

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).length() == min)
                System.out.println(list1.get(i));
        }
    }
}
