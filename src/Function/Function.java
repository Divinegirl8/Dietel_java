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

    public static int numberPower(int firstNumber , int secondNumber) {
        int result = 1;

        for (int number = 1; number <= secondNumber; number++){

            result *= firstNumber;

        }

        return result;

    }
}
