package p;

public class StudentRunner {
    public static void main(String[] args) {
        Student vasya = new Student("Вася", 3, 4, 5, 4);
        Student petya = new Student("Петя", 5, 5, 5, 5);

        System.out.println(vasya);
        System.out.println(petya);
    }
}
