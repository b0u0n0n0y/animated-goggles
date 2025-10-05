package p;

public class Drob {
    private int chislitel;
    private int znamenatel;

    public Drob(int chislitel, int znamenatel) {
        if (znamenatel == 0) {
            znamenatel = 1;
        }
        this.chislitel = chislitel;
        this.znamenatel = znamenatel;

    }

    public Drob sum(Drob other) {
        int newCh = this.chislitel * other.znamenatel + other.chislitel * this.znamenatel;
        int newZn = this.znamenatel * other.znamenatel;
        return new Drob(newCh, newZn);
    }

    public Drob minus(Drob other) {
        int newCh = this.chislitel * other.znamenatel - other.chislitel * this.znamenatel;
        int newZn = this.znamenatel * other.znamenatel;
        return new Drob(newCh, newZn);
    }

    public Drob umnoghd(Drob other) {
        int newCh = this.chislitel * other.chislitel;
        int newZn = this.znamenatel * other.znamenatel;
        return new Drob(newCh, newZn);
    }

    public Drob div(Drob other) {
        if (other.chislitel == 0) {  // деление на ноль — возвращаем исходную дробь
            return this;
        }
        int newCh = this.chislitel * other.znamenatel;
        int newZn = this.znamenatel * other.chislitel;
        return new Drob(newCh, newZn);
    }

    @Override
    public String toString() {
        if (znamenatel == 1) {
            return Integer.toString(chislitel);
        }
        return chislitel + "/" + znamenatel;
    }
}
