package FEMI;

public class stringFunction {

    public static  boolean isPalindromeValue(String word){
        StringBuilder valueWord = new StringBuilder();
        for (int temp = word.length()-1; temp >= 0; temp--) {
            char value = word.charAt(temp);
            valueWord.append(value);
        }
        return valueWord.toString().equals(word);
    }

    public static boolean anagram(String firstWord, String secondWord){

        for (int index = 0; index < firstWord.length(); index++) {
            char value = secondWord.charAt(index);
            for (int temp = 0; temp < index-1; temp++){
                char value2 = firstWord.charAt(temp);
                if (value2 == value && firstWord.length() == secondWord.length()) return true;
            }


        }
        return false;
      
    }


}
