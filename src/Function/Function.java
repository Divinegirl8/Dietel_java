package Function;

import java.util.Scanner;

public class Function {

    public static int Rate(int percentage){
        if (percentage < 50) {
            return percentage * 160 + 5000;
        }
        if (percentage <=59) {
            return percentage * 200 + 5000;
        }
        if (percentage <= 69) {
            return  percentage * 250 + 5000;
        }
        else {
            return percentage * 500 + 5000;
        }
    }

    public static int copies(int copies){
        if (copies > 0 && copies <= 4) {
            return 2000;
        }
        else if (copies <= 9) {
            return 1800;
        }

        else if (copies <= 29) {
            return 1600;
        }
        else if (copies <= 49) {
            return  1500;
        }
        else if (copies <= 99) {
            return  1300;
        }
        else if (copies <= 199) {
            return  1200;
        }

        else if (copies <= 499) {
            return  1100;
        }

        else {
            return 1000;
        }
    }

    public static int numberPower(int firstNumber , int secondNumber) {
        int result = 1;

        for (int number = 1; number <= secondNumber; number++){

            result *= firstNumber;

        }

        return result;

    }
}
