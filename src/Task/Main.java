package Task;

import java.time.Year;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Calendar calendar = Calendar.getInstance();
//        int year = calendar.get(Calendar.YEAR);

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);

        System.out.println(year);
//
//        final int num = 1;
//        num = 1;
        int number = 5 / 2;

        System.out.println(number);

        int grade = 10;

        System.out.println(grade == 10? "yes":"no");

    }
}