package Block_1_1;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x =x;
        this.y = y;
    }

    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}
 class Point_2 {
     public static void main(String[] args) {
         Point one = new Point(1,2);
         Point two = new Point(10,20);
         Point three = new Point(100,200);

         System.out.println(one.toString());
         System.out.println(two.toString());
         System.out.println(three.toString());
     }
 }
