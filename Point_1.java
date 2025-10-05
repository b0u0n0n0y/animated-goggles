package p;

public class Point_1 {
    double x, y;
    Point_1(double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}
