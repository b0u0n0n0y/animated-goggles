package p;

public class Student {

    String name;
    int[] grades;

    public Student(String name, int... grades) {
        this.name = name;
        if (grades.length == 0) {
            this.grades = new int[0];
        } else {
            this.grades = grades;
        }
    }

    public double getAverageGrade() {
        if (grades.length == 0) return 0.0;
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public boolean isExcellent() {
        if (grades.length == 0) return false;
        for (int grade : grades) {
            if (grade != 5) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return name + " - средний балл: " +  getAverageGrade()
                + ", отличник: " + isExcellent();
    }

}
