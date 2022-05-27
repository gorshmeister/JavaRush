package core.level8.lection3.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(reader.readLine());

        int max = 0;
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data > max)
                max = data;
        }

        inputStream.close();
        reader.close();

        System.out.println(max);
    }
}
