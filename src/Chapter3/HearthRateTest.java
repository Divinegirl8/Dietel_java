package Chapter3;

import java.util.Calendar;

public class HearthRateTest {
    public static void main(String[] args) {
        HeartRate heart = new HeartRate("Vera" , "Cruz" , 10 , 7, 1999 );

        System.out.printf("Name: %s %s  %nDate of birth: %d - %d - %d %nAge: %d %nMaximum Heart Rate: %d%n", heart.getFirstName(),heart.getLastName(), heart.getMonth() , heart.getDay() , heart.getYear() , heart.calculateAge() , heart.maxHeartRate());
        heart.targetRate();



    }
}
