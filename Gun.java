package p;

public class Gun {

    int count;

    public Gun(int count) {
        this.count = count;
    }

    public Gun(){
        count = 5;
    }

    public void shoot(){
        if(count>0) {
            System.out.println("Бах!");
            count--;
        }else System.out.println("Клац!");
    }

}
