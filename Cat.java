package p;

public class Cat {

    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "кот: " + name;
    }


    public void may() {
        may(1);
    }

    public void may(int n){
        String result = name + ":";
        if(n == 1){
            result+="мяу!";
        }
        else {
            for (int i = 0; i < n; i++) {
                if (n - i == 1) {
                    result += "мяу!";
                }
                else {
                    result += "мяу-";
                }
            }
        }
        System.out.println(result);
    }
}
