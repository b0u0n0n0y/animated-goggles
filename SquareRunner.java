package p;

public class SquareRunner {
    public static void main(String[] args) {
        Square square = new Square(new Point_1(5, 3), 23);
        newBrokenLine brokenLine = square.getnewBrokenLine();
        System.out.println("Длина ломаной: "+brokenLine.length());
        brokenLine.points[brokenLine.size - 1].x = 15;
        brokenLine.points[brokenLine.size - 1].y = 25;
        System.out.printf("Обновленная длина ломаной: "+ brokenLine.length());
    }
}
