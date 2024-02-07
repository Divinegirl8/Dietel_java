package Leetcode;

public class ValidPalindrome {
    public static String nonAlphaNumeric(String value){
        String convertToLowerCase = value.toLowerCase();
        String newValue = "";



        for (int index = 0; index < convertToLowerCase.length();index++){
        if(String.valueOf(convertToLowerCase.charAt(index)).matches("[a-z0-9]+")){
            newValue += String.valueOf(convertToLowerCase.charAt(index));
        }
        else if (value.equals(" ") || value.isEmpty()){
            newValue = " ";
        }
        }
        return newValue;
    }

    public boolean isPalindrome(String s) {
        String value = nonAlphaNumeric(s);
        String newValue = "";
        for (int index = value.length()-1; index >= 0 ; index--) {
            newValue += String.valueOf(value.charAt(index));


        }
        return  newValue.equals(value);

    }
    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome( " "));
    }
}
