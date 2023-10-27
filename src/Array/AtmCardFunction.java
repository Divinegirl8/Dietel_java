package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class AtmCardFunction {

    public static long[] pickOffValue(long element){
        ArrayList<Long> newNumber = new ArrayList<>();
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
        return convertToArray(newNumber);
    }

    private static long[] convertToArray(ArrayList<Long> result){
        long[] new_list = new long[result.size()];

        for (int index = 0; index < result.size(); index++){
            new_list[index] = result.get(index);
        }
        return new_list;
    }

    public static  int evenPosition(long[] numbers){
        int singleDigit = 0;
        int doubleDigit = 0;
        long twoDigit;

        for (int index = 1; index < numbers.length; index+=2) {
            long value = numbers[index];


            long multiplyByTwo = value * 2;



            if (multiplyByTwo >= 10 && multiplyByTwo <= 99){
                twoDigit = multiplyByTwo;

                int loop = 0;
                while (loop < 2){
                    int add = (int)(twoDigit / Math.pow(10,loop) % 10);
                    loop++;
                    doubleDigit += add;


                }
            }
            else {
                singleDigit += (int)multiplyByTwo;
            }
        }
        return singleDigit + doubleDigit;
    }


public static int oddPosition(long... numbers){
        long total = 0;
        for (int index = 0; index < numbers.length; index+=2){
            total += numbers[index];
        }

        return (int) total;
}

public static int totalOddEven = 0;
public static int addOddEvenPosition(int evenNumber,int oddNumber){
    totalOddEven = evenNumber + oddNumber;
        return evenNumber + oddNumber;
}



public static long getFirstIndexPosition(String numbers){
     char letter = numbers.charAt(0);

     if (Character.isDigit(letter)) return Long.parseLong(String.valueOf(letter));


return Long.parseLong(String.valueOf(numbers.charAt(1)));
}



public static long getSecondIndex(String numbers){
    char letter = numbers.charAt(0);

    if (Character.isDigit(letter)) return Long.parseLong(String.valueOf(numbers.charAt(1)));
    return  Long.parseLong(String.valueOf(numbers.charAt(2)));
}

public static boolean isDivisibleBy10(int number){
    return number % 10 == 0;
}


    public static String isMasterCard(long cardNumber,int number) {
        String cardType = "";
        String status = "";
        int numberLength = String.valueOf(cardNumber).length();
        boolean result = isDivisibleBy10(number);
        long index = getFirstIndexPosition(String.valueOf(cardNumber));


        if (numberLength >= 13 && numberLength <= 16 && result && index == 5) {
            cardType = "MasterCard";
            status = "Valid";
        } else if (numberLength >= 13 && numberLength <= 16 && !result && index == 5) {
            cardType = "MasterCard";
            status = "Invalid";
        }

        return generateOutput(cardType,cardNumber,status);

    }


    public static String isVisaCard(long cardNumber,int number) {
        String cardType = "";
        String status = "";
        int numberLength = String.valueOf(cardNumber).length();
        boolean resultValue = isDivisibleBy10(number);
        long index = getFirstIndexPosition(String.valueOf(cardNumber));


        if (numberLength >= 13 && numberLength <= 16 && resultValue && index == 4) {
            cardType = "VisaCard";
            status = "Valid";
        } else if (numberLength >= 13 && numberLength <= 16 && !resultValue && index == 4) {
            cardType = "VisaCard";
            status = "Invalid";
        }

        return generateOutput(cardType,cardNumber,status);

    }


    public static String isDiscoverCard(long cardNumber,int number) {
        String cardType = "";
        String status = "";
        int numberLength = String.valueOf(cardNumber).length();
        boolean valueOf = isDivisibleBy10(number);
        long index = getFirstIndexPosition(String.valueOf(cardNumber));


        if (numberLength >= 13 && numberLength <= 16 && valueOf && index == 6) {
            cardType = "DiscoverCard";
            status = "Valid";
        } else if (numberLength >= 13 && numberLength <= 16 && !valueOf && index == 6) {
            cardType = "DiscoverCard";
            status = "Invalid";
        }

        return generateOutput(cardType,cardNumber,status);

    }


    public static String isAmericanExpressCard(long cardNumber,int number) {
        String cardType = "";
        String status = "";
        int numberLength = String.valueOf(cardNumber).length();
        boolean valueOf = isDivisibleBy10(number);
        long index = getFirstIndexPosition(String.valueOf(cardNumber));
        long index2 = getSecondIndex(String.valueOf(cardNumber));


        if (numberLength >= 13 && numberLength <= 16 && valueOf && index == 3 && index2 == 7) {
            cardType = "AmericanExpressCard";
            status = "Valid";
        } else if (numberLength >= 13 && numberLength <= 16 && !valueOf && index == 3 && index2 == 7) {
            cardType = "AmericanExpressCard";
            status = "Invalid";
        }

        return generateOutput(cardType,cardNumber,status);

    }

    public static String notValid(long cardNumber,int number) {
        String cardType = "";
        String status = "";
        long index = getFirstIndexPosition(String.valueOf(cardNumber));


        if (index < 3 || index > 7) {
            cardType = "InvalidCard";
            status = "Invalid";
        }

        return generateOutput(cardType,cardNumber,status);

    }




    public static String generateOutput(String cardType,long cardNumber,String status){


        return String.format("""
            *****************************************
            **Credit Card Type: %s
            **Credit Card Number: %d
            **Credit Card Digit Length:  %d
            **Credit Card Validity Status: %s
            ********************************************
            """,cardType,cardNumber,String.valueOf(cardNumber).length(),status);}





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

        long[] result = pickOffValue(Long.parseLong(word));
        int expected = oddPosition(result);
        int expected2 = evenPosition(result);
        getFirstIndexPosition(word);
        getSecondIndex(word);
        addOddEvenPosition(expected,expected2);



        System.out.println(notValid(Long.parseLong(word),addOddEvenPosition(expected,expected2)));

//        5388576018402626
//        2720690186237233

    }
}
