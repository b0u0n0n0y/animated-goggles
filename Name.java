package Block_1_1;

public class Name {
    private String oneName;
    private String name;
    private String twoName;

    public Name(String oneName, String name, String twoName){
        this.oneName = oneName;
        this.name = name;
        this.twoName= twoName;
    }

    public String toString(){
        return oneName + " " + name+ " " +twoName;
    }
}
class Name_2{
    public static void main(String[] args) {
        Name n1 = new Name("","Клеопатра", "");
        Name n2 = new Name("Пушкин","Александр", "Сергеевич");
        Name n3 = new Name("Маяковский","Владимир","");

        System.out.println(n1.toString());
        System.out.println(n2.toString());
        System.out.println(n3.toString());
    }


}
