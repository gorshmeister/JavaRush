package core.level9.lection11.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) return;

        Map<String, Double> map = new TreeMap<String, Double>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            String[] splittedLine;

            while ((line = fileReader.readLine()) != null) {
                splittedLine = line.split(" ");
                String name = splittedLine[0];
                Double value = Double.parseDouble(splittedLine[1]);
                if (map.containsKey(name)) {
                    map.compute(name, (k, v) -> v + value);
                } else
                    map.put(name, value);
            }
        }
        Double max = Collections.max(map.values());
        for (Map.Entry pair : map.entrySet()) {
            if (pair.getValue().equals(max))
                System.out.println(pair.getKey());
        }
    }
}
