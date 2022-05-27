package core.level5.lection9.task1514;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();
    static {
        labels.put(1.1, "val1");
        labels.put(1.2, "val2");
        labels.put(1.3, "val3");
        labels.put(1.4, "val4");
        labels.put(1.5, "val5");
    }

    public static void main(String[] args) {
        System.out.println(labels);

    }
}
