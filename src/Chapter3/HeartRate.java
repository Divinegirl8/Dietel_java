package Chapter3;

import java.util.Calendar;

public class HeartRate {

    private String firstName;
    private  String lastName;

    private int month;

    private int day;
    private int year;

    public HeartRate (String firstName , String lastName , int month, int day , int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public int calculateAge() {
        return 2023 - year;
    }

    public  int maxHeartRate() {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
       int age = currentYear - year;
        int heartRate = 220 - age;

        return heartRate;

    }

    public  void targetRate() {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);

        int age = currentYear - year;
        int heartRate = 220 - age;

        System.out.printf("Target Rate:  %d and %d%n" , 50 - heartRate /100 , 70 - heartRate /100);

    }
}
