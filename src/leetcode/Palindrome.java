package leetcode;

public class Palindrome {
    public static boolean isPalindrome(int x){
      String conversion = String.valueOf(x);
        String compare = "";


      for (int index = conversion.length()-1; index >= 0; index--){
          char value = conversion.charAt(index);
          compare += value;

      }
      return conversion.equals(compare);
    }
}
