package syntax.level7.lection12.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        ArrayList<String> list = new ArrayList<>();

        int cntN = 0;
        while (cntN != N) {
            System.out.print(": ");
            list.add(reader.readLine());
            cntN++;
        }

        int cntM = 0;
        while (cntM != M) {
            list.add(list.get(0));
            list.remove(0);
            cntM++;
        }

        System.out.println(list);

    }
}
