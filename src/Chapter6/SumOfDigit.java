package Chapter6;

public class SumOfDigit {
    public static int sumDigit(int number){
        int total = 0;
        while (number > 0){
            int result = number % 10;
            total += result;
            number/= 10;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sumDigit(7631));
    }
}
