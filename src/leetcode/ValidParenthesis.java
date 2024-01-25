package leetcode;

import java.util.regex.*;


public class ValidParenthesis {

//    public static boolean validParenthesis(String input) {
//        String pattern = "(?=.*\\(\\))(?=.*\\[\\])(?=.*\\{\\})|\\(\\)|\\[\\]|\\{\\}";
//
//        Pattern regexPattern = Pattern.compile(pattern);
//        Matcher matcher = regexPattern.matcher(input);
//
//        return matcher.find();
//
//    }

    public static boolean validParenthesis(String input) {
        String pattern = "(?=.*\\(\\))(?=.*\\[\\])(?=.*\\{\\})|\\(\\)|\\[\\]|\\{\\}";

     return input.matches(pattern);

    }

}
