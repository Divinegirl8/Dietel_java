package Chapter6;

public class BeautifyString {
    public static String beautifyFullStop(String word){
        if ((String.valueOf(word.charAt(word.length()-1)).equals("."))){
            return word;
        }
        return word.substring(0,word.length()-1)+word.charAt(word.length() - 1) +".";
    }


    public static String beautifyFirstLetter(String word){
        return  ((String.valueOf(word.charAt(0))).toUpperCase()+ word.substring(1));
    }

    public static String beautifyFullstopAndCapital(String word){
        return beautifyFirstLetter(beautifyFullStop(word));
    }


}
