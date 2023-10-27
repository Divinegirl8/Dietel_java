package Chapter6;

public class PerfectNumbers {
    public static boolean isPerfectNumber(int number){
        int total = 0;
        for (int index = 1; index < number; index++) {
            if (number % index == 0){
                total += index;

            }
        }
        return total == number;
    }

}
