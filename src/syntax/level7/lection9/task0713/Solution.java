package syntax.level7.lection9.task0713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);

            if (x % 3 == 0)
                odd.add(x);
            if (x % 2 == 0)
                even.add(x);
            if (x % 3 != 0 && x % 2 != 0)
                other.add(x);
        }
        printList(odd);
        printList(even);
        printList(other);
    }

    public static void printList(ArrayList<Integer> list) {
        System.out.println(list.toString());
    }
}
