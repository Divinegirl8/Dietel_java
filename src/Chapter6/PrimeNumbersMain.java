package Chapter6;

import java.lang.annotation.Target;
import static Chapter6.PrimeNumbers.*;

public class PrimeNumbersMain {
    public static void main(String[] args) {
        int count = 0;
        for (int index = 1; index < 10000; index++) {
            if (primeNumbers(index) > 0){
                count++;
                System.out.println(primeNumbers(index));
            }
        }

        System.out.println("\n" + "How many numbers up to 10,000 do you have to test to ensure that you’ve found all the primes?\n" + count + "\n\n" + "part b");


        for (int temp = 1; temp < Math.sqrt(10000); temp++) {
            if (primeNumbers(temp) > 0){
                System.out.println(primeNumbers(temp));
            }
        }

    }
}

