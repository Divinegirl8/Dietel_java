package pythonDict;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListToDict {
    public static Map<String,Integer> twoList(String[] letters, int[] numbers){
        Map<String,Integer> twoValues = new HashMap<>();

        for (int index = 0; index < Math.min(letters.length,numbers.length); index++) {
            twoValues.put(letters[index],numbers[index]);

        }


        return twoValues;
    }

    public static void main(String[] args) {
        String[] element1 = {"a", "b", "c", "d", "a"};
        int[] element2 = {1, 2, 3, 4, 5};
        System.out.println(twoList(element1,element2));
    }
}
