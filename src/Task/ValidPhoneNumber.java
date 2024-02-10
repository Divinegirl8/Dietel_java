package Task;

import java.util.ArrayList;
import java.util.List;

public class ValidPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> newList = new ArrayList<>();

        if (digits == null || digits.isEmpty())
            return newList;

        StringBuilder combination = new StringBuilder();
        generateCombinations(digits, 0, combination, newList);

        return newList;
    }

    private void generateCombinations(String digits, int index, StringBuilder combination, List<String> combinations) {
        if (index == digits.length()) {
            combinations.add(combination.toString());
            return;
        }

        String letters = letter(String.valueOf(digits.charAt(index)));
        for (int i = 0; i < letters.length(); i++) {
            combination.append(letters.charAt(i));
            generateCombinations(digits, index + 1, combination, combinations);
            combination.deleteCharAt(combination.length() - 1);
        }
    }
    public String letter(String digits) {
        String phoneNumber = "";

            if (digits.equals("1")) {
                phoneNumber = "error";
            }

            if (digits.equals("2")) {
                phoneNumber = "abc";
            }
            if (digits.equals("3")) {
                phoneNumber = "def";
            }
            if (digits.equals("4")) {
                phoneNumber = "ghi";
            }
            if (digits.equals("5")){
                phoneNumber = "jkl";
            }
            if (digits.equals("6")) {
                phoneNumber = "mno";
            }
            if (digits.equals("7")) {
                phoneNumber = "pqrs";
            }
            if (digits.equals("8")) {
                phoneNumber = "tuv";
            }

            if(digits.equals("9")){
                phoneNumber = "wxyz";
            }


        return phoneNumber;
    }

    public static void main(String[] args) {
        ValidPhoneNumber validPhoneNumber = new ValidPhoneNumber();

        System.out.println(validPhoneNumber.letterCombinations("23"));
    }

}
