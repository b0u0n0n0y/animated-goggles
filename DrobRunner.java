package p;

public class DrobRunner {
    public static void main(String[] args) {
        Drob f1 = new Drob(1, 3);
        Drob f2 = new Drob(2, 3);
        Drob f3 = new Drob(3, 4);
        Drob fZeroDenominator = new Drob(5, 0); // Знаменатель 0 → 1

        System.out.println("f4 (5/0) => " + fZeroDenominator);

        Drob rSum = f1.sum(f2);  // 1/3 + 2/3 = 1
        System.out.println(f1 + " + " + f2 + " = " + rSum);

        Drob rMinus = f2.minus(f1);  // 2/3 - 1/3 = 1/3
        System.out.println(f2 + " - " + f1 + " = " + rMinus);

        Drob rUmnoghd = f1.umnoghd(f2);  // 1/3 * 2/3 = 2/9
        System.out.println(f1 + " * " + f2 + " = " + rUmnoghd);

        Drob rDiv = f1.div(f3);  // 1/3 / 3/4 = 4/9
        System.out.println(f1 + " / " + f3 + " = " + rDiv);

        Drob rDivZero = f1.div(new Drob(0, 1));
        System.out.println(f1 + " / 0 = " + rDivZero + " (деление на ноль возвращает исходную)");

    }
}




