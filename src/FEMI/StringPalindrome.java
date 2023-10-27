package FEMI;

public class StringPalindrome {

    public static boolean isStringPalindrome(String word){
        String compare = "";
        String newWord = capitalizeLastIndex(word);
        for (int index = newWord.length()-1; index >= 0; index--) {
            char value = newWord.charAt(index);
            compare += value;
        }
        return word.equals(compare);
    }

    public static String capitalizeLastIndex(String word){
        char lastChar = word.charAt(word.length() - 1);
        char firstChar = word.charAt(0);
        String capitalizedLastChar = String.valueOf(lastChar).toUpperCase();
        String lowerFirstChar = String.valueOf(firstChar).toLowerCase();


        if (Character.isUpperCase(firstChar) && Character.isLowerCase(lastChar)){
        return lowerFirstChar + word.substring(1, word.length() - 1) + capitalizedLastChar;}

        else if (Character.isLowerCase(firstChar) && Character.isUpperCase(lastChar)){
            return String.valueOf(firstChar).toUpperCase() + word.substring(1,word.length() -1) + String.valueOf(lastChar).toLowerCase();
        }

        return word;
    }

}



