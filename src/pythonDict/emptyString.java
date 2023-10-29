package pythonDict;

import java.util.ArrayList;
import java.util.Objects;

public class emptyString {
    public static String[] removeEmptyString(String[] values){
        ArrayList<String> result = new ArrayList<>();

        for (String value : values) {
            if (!Objects.equals(value, "")){
                result.add(value);
            }
        }

        return convertToArray(result);
    }

    private static String[] convertToArray(ArrayList<String> items){
        String[] array = new String[items.size()];

        for (int index = 0; index < items.size(); index++) {
            array[index] = items.get(index);
        }

        return array;
    }
}
