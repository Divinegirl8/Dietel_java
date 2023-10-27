package Chapter6;

public class PalindromeNumber {
    public static boolean isPalindromeNumber(int number){
        String convert = String.valueOf(number);

        StringBuilder check = new StringBuilder();
        for (int index = convert.length()-1; index >= 0 ; index--) {
           char value = convert.charAt(index);
           check.append(value);

        }
       return check.toString().equals(convert);
    }

}
