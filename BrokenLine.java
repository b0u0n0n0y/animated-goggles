package p;

class BrokenLine {
    Point_1[] points;
    int size;

    BrokenLine(Point_1[] pts) {
        points = new Point_1[10];  // Максимум 10 точек для примера
        size = pts.length;
        for (int i = 0; i < size; i++) {
            points[i] = pts[i];
        }
    }

    void addPoints(Point_1[] newPoints) {
        for (int i = 0; i < newPoints.length; i++) {
            if (size < points.length) {
                points[size] = newPoints[i];
                size++;
            }
        }
    }

    double length() {
        double sum = 0;
        for (int i = 0; i < size - 1; i++) {
            double dx = points[i + 1].x - points[i].x;
            double dy = points[i + 1].y - points[i].y;
            sum += Math.sqrt(dx * dx + dy * dy);
        }
        return sum;
    }
}