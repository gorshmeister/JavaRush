package syntax.level6.lection8.task0609;

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double x = (x1 - x2)*(x1 - x2);
        double y = (y1 - y2)*(y1 - y2);
        return Math.sqrt(x + y);
    }

    public static void main(String[] args) {
        System.out.println(getDistance(2, -5, -4, 3));
    }
}
