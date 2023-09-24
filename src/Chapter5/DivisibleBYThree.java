package Chapter5;

import Function.Function;

public class DivisibleBYThree {
    public static int number(int number) {
        int total = 0;
        if (number < 0) {
            return 0;
        }
        for (int count = 0; count <= number; count += 3){
            total += count;

        }
        return total;
    }


}
