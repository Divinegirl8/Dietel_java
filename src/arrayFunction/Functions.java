package arrayFunction;

import java.util.ArrayList;

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



    public static ArrayList<Integer> reverseNumber(int[] integer){
        ArrayList<Integer> result = new ArrayList<>();
        for (int count = integer.length-1; count >= 0; count--){
            result.add(integer[count]);
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
        String word = "";
        int checkLength = letters.length();

        for(int count = checkLength - 1; count >= 0; count--){
         char index = letters.charAt(count);
           word += index;
        }
        return word.equals(letters);
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


    public static String twoList(String[] firstInput ,int[] secondInput){
        StringBuilder result = new StringBuilder(" [");

        for (int row = 0; row < firstInput.length; row++){
            result.append(firstInput[row]).append(",").append(secondInput[row]);
            if (row < secondInput.length-1){
            result.append(",");}
        }
        result.append("]");

        return result.toString();
    }



    public static String twoSeperateList(String[] firstInput , int[] secondInput){
        StringBuilder result1 = new StringBuilder("");
        StringBuilder result2 = new StringBuilder("");

        for (String letter: firstInput){
            result1.append(letter).append(",");
        }

        for (int count = 0; count < secondInput.length; count++) {
            result2.append(secondInput[count]);
            if (count < secondInput.length - 1){
                result2.append(",");
            }
        }

        return "[" + result1 + result2 + "]";

    }


    public static String digitToList(int integer){
        StringBuilder word = new StringBuilder("[");
        String value = String.valueOf(integer);


        for (int count = 0; count < value.length(); count ++){
            char me = value.charAt(count);
            word.append(me);

            if(count < value.length()-1){
                word.append(",");
            }
        }

        word.append("]");

        return word.toString();

    }

 


    }


