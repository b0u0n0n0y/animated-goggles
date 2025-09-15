package Block_1_1;

public class Time {

    private int second;
    private int minute;
    private int hour;

    public Time(int second){
        this.second = second;
    }

    public String toString(){
        return hour + ":" + minute + ":" + second;
    }

    public String check(){
        if (second < 60) return toString();
        else{
            hour = second / 60;
            if(hour>24){
                hour  %= 24;
            }
            minute = second % 60;
            if (second>60){
                second = 0;
            }

            return toString();
        }
    }
}

class Time_2{
    public static void main(String[] args) {
        Time sec1 = new Time(10);
        Time sec2 = new Time(10000);
        Time sec3 = new Time(100000);
        System.out.println(sec1.check());
        System.out.println(sec2.check());
        System.out.println(sec3.check());


    }
}


