package syntax.level8.lection6.task0812;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10));
        }

        System.out.println(list.toString());

        int cnt = 1, cntMax = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                cnt++;
                cntMax = cnt;
            } else cnt = 1;
        }

        if (cnt > cntMax)
            System.out.println(cnt);
        else System.out.println(cntMax);
    }
}
