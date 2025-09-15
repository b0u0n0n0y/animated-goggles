package Block_1_1;

public class Human {
    private String name;
    private int height;

    public Human(String name, int height){
        this.name = name;
        this.height = height;
    }

    public String toString(){
        return name + ", рост: " + height;
    }

}
class Human_2 {
    public static void main(String[] args) {
        Human h1 = new Human("Клеопатра",152);
        Human h2 = new Human("Пушкин",167);
        Human h3 = new Human("Александр",189);

        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println(h3.toString());
    }
}


