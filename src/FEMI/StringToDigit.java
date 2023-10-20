package FEMI;

import java.util.Arrays;

public class StringToDigit {

    public static int checkString (String[] word) {
        int count = 0;
        for (String value : word) {
            for (int index = 0; index < value.length(); index++) {
                char output = value.charAt(index);
                String change = String.valueOf(output);
                if (change.matches("\\d+")) {
                    ++count;
                }
            }
        }

   return count;

}}