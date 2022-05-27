package syntax.level5.lection9.task0522;

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
        this(x, y, 1);
    }

    public Circle(double radius) {
        this(5, 5, radius);
    }

    public Circle() {
        this(5, 5, 1);
    }
}
