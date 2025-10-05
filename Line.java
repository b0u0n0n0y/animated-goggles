package p;

public class Line {
    Point start;
    Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public int getLength() {
        double dx = end.x - start.x;
        double dy = end.y - start.y;
        return (int) Math.round(Math.sqrt(dx * dx + dy * dy));
    }

    @Override
    public String toString() {
        return "Линия: начало {" + start.x + ";" + start.y + "}, конец {" + end.x + ";" + end.y + "}";
    }
}

