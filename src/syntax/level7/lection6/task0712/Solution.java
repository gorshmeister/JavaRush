package syntax.level7.lection6.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        int min = 10;
        int max = -1;
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());

            if (list.get(i).length() < min)
                min = list.get(i).length();

            if (list.get(i).length() > max)
                max = list.get(i).length();
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == max) {
                System.out.println(list.get(i));
                break;
            }
            if (list.get(i).length() == min) {
                System.out.println(list.get(i));
                break;
            }
        }
    }
}
