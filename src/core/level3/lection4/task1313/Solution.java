package core.level3.lection4.task1313;

import java.awt.*;

public class Solution {
    public static void main(String[] args) {

    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
