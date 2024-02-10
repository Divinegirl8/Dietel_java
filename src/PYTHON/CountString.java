package PYTHON;

import java.util.HashMap;
import java.util.Map;

public class CountString {
    public static Map<String,Integer> frequency(String words){
        Map<String,Integer> result = new HashMap<>();

        for (int index = 0; index < words.length(); index++) {
            int count = 0;
            for (int temp = 0; temp < words.length(); temp++) {
                if (String.valueOf(words.charAt(index)).equals(String.valueOf(words.charAt(temp)))){
                    count++;
                }
            }
            result.put(String.valueOf(words.charAt(index)),count);
        }
        return result;
    }


}
