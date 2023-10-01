package arrayFunction;

import java.util.Scanner;

public class Functions {

    public static int largestNumberInList(int[] integers) {
        int largest = 0;
        for (int integer : integers) {
            if (integer > largest) {
                largest = integer;
            }
        }
        return largest;
    }



    public static String reverseNumber(int[] integer){
        String result = " ";
        for (int count = integer.length-1; count >= 0; count--){

            String value = String.valueOf(integer[count]);
            result += value + " ";
        }
        return result;
    }



    public static String oddElement(int[] integer){
          String result = " ";
        for (int count = 1; count < integer.length; count += 2){
            String value = String.valueOf(integer[count]);
            result += value + " ";
        }
       return result;
    }

    public static String evenElement(int[] integer){
         String result = " ";
        for (int count = 0; count < integer.length; count += 2){
            String value = String.valueOf(integer[count]);
            result += value + " ";
        }

        return result;

    }

   public static boolean checkElement(int[] integer, int number){
        for (int numbers : integer) if (numbers == number) return true;
        return false;
   }



    public static boolean stringPalindrome(String letters){
        String obi = "";
        int checkLength = letters.length();

        for(int count = checkLength - 1; count >= 0; count--){
         char index = letters.charAt(count);;
           obi += index;
        }
        return obi.equals(letters);
    }


    public static double summationUsingForLoop(double[] numbers){
        double total = 0;

        for (int count = 0; count < numbers.length; count++){
            total += numbers[count];
        }

        return Math.round(total * 100.0) / 100.0;
    }

    public static double summationUsingWhileLoop(double[] numbers){
        double total = 0;

        int count = 0;
        while (count < numbers.length){
            total += numbers[count];
            count ++;
        }

        return total;
    }

    public static double summationUsingDoWhileLoop(double[] numbers){

        double total = 0;
        int count = 0;

        do {
            total += numbers[count];
            ++count;
        }

        while (count != numbers.length);


     return Math.round(total * 100.0) / 100.0;
    }


    public static String runningTotal(int[] numbers){
        int total = 0;

       int count = 0;
       String result = " ";

       while (count < numbers.length){

           total += numbers[count];

           count += 1;
           String output = String.valueOf(total);
           result += output + " ";


       }
      return result;
    }






    }


