package p;

class Square {
    Point_1 topLeft;
    double side;

    Square(Point_1 topLeft, double side) {
        this.topLeft = topLeft;
        this.side = side;
    }

    Square(double x, double y, double side) {
        this.topLeft = new Point_1(x, y);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + topLeft + " со стороной " + side;
    }

    newBrokenLine getnewBrokenLine() {
        Point_1 p1 = topLeft;
        Point_1 p2 = new Point_1(topLeft.x + side, topLeft.y);
        Point_1 p3 = new Point_1(topLeft.x + side, topLeft.y + side);
        Point_1 p4 = new Point_1(topLeft.x, topLeft.y + side);
        Point_1[] corners = {p1, p2, p3, p4, p1};
        return new newBrokenLine(corners);
    }
}