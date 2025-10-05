package p;

public class BrokenLineRunner {
    public static void main(String[] args) {
        Point_1[] initialPoints = {
                new Point_1(1, 5),
                new Point_1(2, 8),
                new Point_1(5, 3)
        };
        BrokenLine line = new BrokenLine(initialPoints);

        System.out.println("Длина ломаной: "+ line.length());

        Point_1[] addedPoints = {
                new Point_1(5, 15),
                new Point_1(8, 10)
        };
        line.addPoints(addedPoints);

        System.out.println("Обновленная длина ломаной: "+ line.length());
    }
}
