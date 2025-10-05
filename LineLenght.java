package p;

public class LineLenght {
    public static void main(String[] args) {
        Line line = new Line(1, 1, 10, 15);

        System.out.println(line);
        System.out.println("Длина линии: " + line.getLength());
    }
}

