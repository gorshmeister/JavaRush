package core.level6.lection13.task1632;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());

        for (Thread thread : threads) {
            thread.start();
        }
    }

    public static void main(String[] args) {
    }
}
