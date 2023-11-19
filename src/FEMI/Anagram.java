package FEMI;

import java.util.Arrays;

public class Anagram {
    public static boolean anagram(String firstValue, String secondValue){
     if (firstValue.length() != secondValue.length()) return false;

     char[] newFirstValue = firstValue.toCharArray();
     char[] newSecondValue = secondValue.toCharArray();

     Arrays.sort(newFirstValue);
     Arrays.sort(newSecondValue);

     return Arrays.equals(newFirstValue,newSecondValue);
    }


    public static void main(String[] args) {
        System.out.println();
    }



}
