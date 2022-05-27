package core.level8.lection5.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try (FileInputStream inputStream = new FileInputStream(reader.readLine());
             FileOutputStream outputStream = new FileOutputStream(reader.readLine())) {

            ArrayList<Integer> list = new ArrayList<>();

            while (inputStream.available() > 0) {
                list.add(inputStream.read());
            }
            Collections.reverse(list);
            for (int bytes : list) {
                outputStream.write(bytes);
            }
        }
    }
}


