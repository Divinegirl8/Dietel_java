package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class AtmCard {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, Kindly Enter Card details to verify");
        long card = scan.nextLong();
        String value = String.valueOf(card);




        ArrayList<Long> pickedDigits = new ArrayList<>();
        int count = 0;

        while (count < value.length()) {
            long pickOff = (long) (card / Math.pow(10, count) % 10);
            pickedDigits.add(pickOff);
            count++;
        }


        int single = 0;
        int doubleDigit = 0;
        long twoDigit = 0;

        for (int evenIndex = 1; evenIndex < value.length(); evenIndex += 2){
            long store = pickedDigits.get(evenIndex);
            long product = store * 2;
            if (product >= 10 && product <= 99){
                twoDigit = product;
                int loop = 2;
                while (loop > 0){
                    loop--;
                    int out = (int)(twoDigit / Math.pow(10,loop) % 10);
                    doubleDigit += out;
                }

            }
            else {
                single += (int) product;
            }
        }

        int sumEven  = doubleDigit + single;



// Odd position
        int sumOdd = 0;
        for (int index = 0; index < value.length(); index+=2) {
            int result = Math.toIntExact(pickedDigits.get(index));
            sumOdd += result;
        }

        int sumAll = sumEven + sumOdd;



int getFirstIndex = pickedDigits.size()-1;
int getSecondIndex = pickedDigits.size()-2;
long check = pickedDigits.get(getFirstIndex);
long checkIndex2 = pickedDigits.get(getSecondIndex);




//        MasterCard

        if (check == 5 && value.length() >= 13 && value.length() <= 16 && sumAll % 10 == 0){
            System.out.printf("""
*****************************************
**Credit Card Type: MasterCard
**Credit Card NUmber: %d
**Credit Card Digit Length: %d
**Credit Card Validity Status: Valid
********************************************\s
%n         \s
                  """,card,value.length());
        }

        else if (check == 5 && value.length() >= 13 && value.length() <= 16 && sumAll % 10 != 0) {
            System.out.printf("""
*****************************************
**Credit Card Type: MasterCard
**Credit Card NUmber: %d
**Credit Card Digit Length: %d
**Credit Card Validity Status: InValid
********************************************\s
%n         \s
                  """,card,value.length());
        }




//        American Express Card


        if(check == 3 && checkIndex2 == 7 && value.length() >= 13 && value.length() <= 16 && sumAll % 10 == 0){
            System.out.printf("""
*****************************************
**Credit Card Type: American Express Card
**Credit Card NUmber: %d
**Credit Card Digit Length: %d
**Credit Card Validity Status: Valid
********************************************\s
%n         \s
                  """,card,value.length());
        }

        else if(check == 3 && checkIndex2 == 7 && value.length() >= 13 && value.length() <= 16 && sumAll % 10 != 0)  {
            System.out.printf("""
*****************************************
**Credit Card Type: American Express Card
**Credit Card NUmber: %d
**Credit Card Digit Length: %d
**Credit Card Validity Status: InValid
********************************************\s
%n         \s
                  """,card,value.length());

        }




//        Discover Cards
        if(check == 6 && value.length() >= 13 && value.length() <= 16 && sumAll % 10 == 0){
            System.out.printf("""
*****************************************
**Credit Card Type: Discover Cards
**Credit Card NUmber: %d
**Credit Card Digit Length: %d
**Credit Card Validity Status: Valid
********************************************\s
%n         \s
                  """,card,value.length());
        }
        else if(check == 6 && value.length() >= 13 && value.length() <= 16 && sumAll % 10 != 0) {
            System.out.printf("""
*****************************************
**Credit Card Type: Discover Cards
**Credit Card NUmber: %d
**Credit Card Digit Length: %d
**Credit Card Validity Status: InValid
********************************************\s
%n         \s
                  """,card,value.length());
        }



//        VisaCard


        if (check == 4 && value.length() >= 13 && value.length() <= 16 && sumAll % 10 == 0 ){
            System.out.printf("""
*****************************************
**Credit Card Type: VisaCard
**Credit Card NUmber: %d
**Credit Card Digit Length: %d
**Credit Card Validity Status: Valid
********************************************\s
%n         \s
                  """,card,value.length());
        }

        else if (check == 4 && value.length() >= 13 && value.length() <= 16 && sumAll % 10 != 0) {
            System.out.printf("""
*****************************************
**Credit Card Type: VisaCard
**Credit Card NUmber: %d
**Credit Card Digit Length: %d
**Credit Card Validity Status: InValid
********************************************\s
%n         \s
                  """,card,value.length());
        }

if(check < 3 || check > 6){

    System.out.printf("""
*****************************************
**Credit Card Type: Invalid Card
**Credit Card NUmber: %d
**Credit Card Digit Length: %d
**Credit Card Validity Status: InValid
********************************************\s
%n         \s
                  """,card,value.length());

}


    }}

