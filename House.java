package Block_1_1;

public class House {

        private int floor;

        public House(int floor){
            this.floor = floor;
        }
        public String toString(){
            if( floor % 10 == 1) return "Дома с " + floor +" этажом";
            else return "Дома с " + floor +" этажами";
        }

}
class House_2{
    public static void main(String[] args) {
        House h1 = new House(1);
        House h2 = new House(5);
        House h3 = new House(23);

        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println(h3.toString());
    }


}
