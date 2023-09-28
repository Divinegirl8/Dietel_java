package Task;

import Function.Function;

import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//
//
//
//        System.out.println("Hello world!");

//        Calendar calendar = Calendar.getInstance();
//        int year = calendar.get(Calendar.YEAR);

//        Calendar calendar = Calendar.getInstance();
//        int year = calendar.get(Calendar.YEAR);
//
//        System.out.println(year);
//
//        final int num = 1;
//        num = 1;
//        int number = 5 / 2;
//
//        System.out.println(number);
//
//        int grade = 10;
//
//        System.out.println(grade == 10? "yes":"no");


        sumNumbers(34);


    }

    public static  void sumNumbers(long number){
        String extractNumber = String.valueOf(number);
        int integer = extractNumber.length();

        int count = integer;
        int sum = 0;
        int result = 0;

        while (count > 0){
            count --;
            result = (int) number / Function.numberPower(10,count) % 10;

            System.out.println(result);
        }

    }
}