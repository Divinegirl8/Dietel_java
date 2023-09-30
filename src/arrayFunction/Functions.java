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






    }


