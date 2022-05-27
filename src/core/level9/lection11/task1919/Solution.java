package core.level9.lection11.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) return;

        Map<String, Double> map = new TreeMap<String, Double>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
            while (fileReader.ready()) {
                String info = fileReader.readLine();
                String[] infoSplit = info.split(" ");

                if (map.containsKey(infoSplit[0])) {
                    map.compute(infoSplit[0], (k,v) -> v+Double.parseDouble(infoSplit[1]));
                } else
                    map.put(infoSplit[0], Double.parseDouble(infoSplit[1]));
            }
        }
        map.forEach((k, v) -> System.out.println("Фамилия: " + k + " " + "Значение:\t" + v));;
    }
}
