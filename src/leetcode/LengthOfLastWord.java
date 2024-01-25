package leetcode;

import java.util.Arrays;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
     String[] convertToArray = s.trim().split("\\s+");

     if (convertToArray.length == 0){
         return 0;
     }

     return convertToArray[convertToArray.length-1].length();
    }
}
