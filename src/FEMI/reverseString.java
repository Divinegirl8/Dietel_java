package FEMI;

public class reverseString {

    public static String reverseWord(String word){
        String check = "";

        for (int count = word.length()-1; count >= 0; count--){
            char value = word.charAt(count);
            check += value;
        }
        return check;
    }

    public static String displayWord(String word){
        String display = "";
        String sentence = word.toLowerCase();
        String[] words = sentence.split(" ");

        for (int count = words.length-1; count >= 0; count--){
            display += words[count] + " ";
        }

        return display;
    }

}
