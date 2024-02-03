package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.*;


public class ValidParenthesis {
    public static boolean validParenthesis(String input){
        List<String> newValue = new ArrayList<>();
        String store = String.valueOf(input.trim().charAt(input.length()-1));


        for (int index = 0; index < input.length(); index+=2) {
            String value = String.valueOf(input.trim().charAt(index));
            String value2 = String.valueOf(input.trim().charAt(index + 1));
               newValue.add(value+value2);
        }
        if (input.length() % 2 != 0){
            newValue.add(store);
        }


        boolean isTrue = false;

        for (int index = 0; index < newValue.size(); index++) {
            if (checkValue(newValue.get(index))){
                isTrue = true;
            }
            else {
                isTrue = false;
            }
        }
        return isTrue;
    }


public static boolean checkValue(String value){
    return  (value.equals("()") || value.equals("{}") || value.equals("[]"));
}

}
