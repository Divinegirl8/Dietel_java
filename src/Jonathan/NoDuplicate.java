package Jonathan;

public class NoDuplicate {


    public static int noDuplicates(int[] elements) {
        int foundElement = 0;
        for (int element : elements) {
            int count = 0;
            for (int value : elements) {
                if (value == element) {count++;}
            }
            if (count == 1) foundElement = element;
        }
        return foundElement;
    }

}
