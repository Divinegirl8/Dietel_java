package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class AtmCardFunction {
    public static ArrayList<Long> newNumber = new ArrayList<>();
    public static ArrayList<Long> pickOffValue(long element){
        long number;
        if (element < 0){
            number = element * -1;
        }
        else {
            number = element;
        }

        String convert = String.valueOf(number);

        for (int index = convert.length()-1; index >= 0; index--) {
            char value = convert.charAt(index);
            long integer = Long.parseLong(String.valueOf(value));
           newNumber.add(integer);
        }
        return newNumber;
    }


    public static  int even_position(ArrayList<Long> numbers){
        int singleDigit = 0;
        int doubleDigit = 0;
        long twoDigit;

        for (int index = 1; index < numbers.size(); index+=2) {
            long value = numbers.get(index);
            long multiplyByTwo = value * 2;

            if (multiplyByTwo >= 10 && multiplyByTwo <= 99){
                twoDigit = multiplyByTwo;
                int loop = 2;
                while (loop > 0){
                    loop--;
                    int add = (int)(twoDigit / Math.pow(10,loop) % 10);
                    doubleDigit += add;
                }
            }
            else {
                singleDigit += (int)multiplyByTwo;
            }
        }
        return singleDigit + doubleDigit;
    }





    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String word = scan.nextLine();

        while (!word.matches("\\d+") || word.length() <= 12 || word.length() >= 17){
            System.out.println("Error!!!" + "\n" + "Enter a number: ");
            word = scan.nextLine();
        }
        long num = 0;

        if (word.matches("\\d+")){
           num = Long.parseLong(word);
        }

        System.out.println(even_position(pickOffValue(num)));

    }
}
