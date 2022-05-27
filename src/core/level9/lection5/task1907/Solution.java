package core.level9.lection5.task1907;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();

        int count = 0;
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            while (fileReader.ready()) {
                for (String s : fileReader.readLine().split("\bworld\b")) {
                    if (s.equals("world")) {
                        count++;
                    }
                }
            }
            System.out.println(count);

        }

    }
}
