package Chapter6;

public class PrimeNumbers {
    public static int primeNumbers(int number){
        int count = 0;

        for (int index = 1; index <= number; index++) {
            if (number % index == 0){
                ++count;
            }
        }

        if (count <= 2) return number;
        return 0;
    }


}
