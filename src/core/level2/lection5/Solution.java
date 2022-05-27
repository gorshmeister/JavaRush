package core.level2.lection5;

public class Solution {
    public static void main(String[] args) {

    }

    public abstract class ChessItem {
        public int x, y;
        private int value;

        public int getValue() {
            return value;
        }

        public abstract void draw();

    }
}


