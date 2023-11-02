package Chapter6;

public class GreatestCommonDivisor {
    public static int gcd(int number, int number2){
        while (number2 != 0){
            int store = number2;
            number2 = number % number2;
            number = store;
        }
        return number;
    }
}
