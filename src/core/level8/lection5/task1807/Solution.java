package core.level8.lection5.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())) {
            int count = 0;
            while (inputStream.available() > 0) {
                if (inputStream.read() == 44) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
