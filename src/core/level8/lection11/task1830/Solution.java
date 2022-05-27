package core.level8.lection11.task1830;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            int countSpace = 0, countAll = 0;
            int c;
            while ((c = reader.read()) != -1) {
                countAll++;
                if ((c == ' ')) {
                    countSpace++;
                }
            }
            System.out.println(countAll);
            System.out.println(countSpace);

            double result = Math.round((double) countSpace / (countAll * 100));
            System.out.printf("%.2f", result);
        }
    }
}
