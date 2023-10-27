package FEMI;

public class NumberPalindrome {
    public static boolean isNumberPalindrome(String number){
        String result = "";
        for (int index = number.length()-1; index >= 0; index--) {
            char value = number.charAt(index);
            result += value;

        }

        return number.matches("\\d+") && number.equals(result);
    }

}
