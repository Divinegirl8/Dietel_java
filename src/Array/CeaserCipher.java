package Array;

import java.util.Scanner;

public class CeaserCipher {

    public static String encryptWord(String letters){
        String concatenate = "";
        for (int values = 0; values < letters.length(); values++) {
            char getLetter = letters.charAt(values);
            char shiftLetter = (char) (getLetter - 3);

            if (getLetter >= 'a' && getLetter <= 'c'){
                shiftLetter =(char) (getLetter + 23);
            }
            else if (getLetter >= 'A' && getLetter <= 'C'){
                shiftLetter = (char) (getLetter + 23);
            }

            String element = String.valueOf(shiftLetter);
            concatenate += element;
        }
        return concatenate;
    }


    public static String decryptWord(String word){
        String joinWords = "";

        for (int index = 0; index < word.length(); index++) {
            char element = word.charAt(index);
            char result = (char) (element + 3);

            if (element >= 'x' && element <= 'z'){
                result = (char) (element - 23);
            }
            else if (element >= 'X' && element <= 'Z'){
                result = (char) (element - 23);
            }
            String value = String.valueOf(result);
            joinWords += value;
        }
        return joinWords;
    }

}
