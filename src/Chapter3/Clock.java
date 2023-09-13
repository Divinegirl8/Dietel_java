package Chapter3;

public class Clock {

    private int hour;
    private int minute;
    private int second;

    public  Clock(int hour , int minute , int second) {


        if(hour > 23) {
            hour = 0;
        }
        else {
            this.hour = hour;
        }

        if(minute > 59) {
            minute = 0;
        }
         else {
             this.minute = minute;
        }


        if ( second > 59) {
            second = 0;
        }
        else {
            this.second = second;
        }

    }

    public void setHour(int hour) {

    }

    public void setMinute(int minute) {

    }


    public void setSecond(int second) {

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }


    public void displayTime() {
        System.out.printf("The time is %d : %d : %d", hour , minute , second);
    }

}
