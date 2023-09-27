package Task;

import Function.Function;

public class SumDigit {
    public static  int sumDigits(long number){
        String extractNumber = String.valueOf(number);
        long integer = extractNumber.length();

        int count = 0;
        int sum = 0;

        while (count < integer){
           int result = (int) number / Function.numberPower(10,count) % 10;
            count ++;
            sum += result;
        }

        return sum;

    }

    public static void main(String[] args) {
        System.out.println(sumDigits(1119));
    }
}
