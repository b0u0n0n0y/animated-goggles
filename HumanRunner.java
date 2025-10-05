package p;

public class HumanRunner {
    public static void main(String[] args) {

        Chelovek ded = new Chelovek("Иван", "Петрович", "Иванов", null);
        Chelovek syn = new Chelovek("Пётр", "Иванович", "", ded);
        Chelovek vnuk = new Chelovek("Алексей", "Петрович", null, syn);


        System.out.println(ded);
        System.out.println(syn);
        System.out.println(vnuk);
    }
}
