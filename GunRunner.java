package p;

public class GunRunner {
    public static void main(String[] args) {
        Gun gun = new Gun();
        for (int i = 0; i < 5; i++) {
            gun.shoot();
        }
    }
}
