package core.level8.lection3.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();

        try (FileInputStream inputStream = new FileInputStream(reader.readLine())) {
            while (inputStream.available() > 0) {
                int data = inputStream.read();

                if (map.containsKey(data)) {
                    map.put(data, map.get(data) + 1);
                } else
                    map.put(data, 0);
            }
        }

        int byteFrequency = Collections.max(map.values());
        map.forEach((k, v) -> {
            if (v == byteFrequency) System.out.println(k + " ");
        });
//
//        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
//            if (byteFrequency == pair.getValue()) {
//                System.out.print(pair.getKey() + " ");
//            }
//        }

    }
}
