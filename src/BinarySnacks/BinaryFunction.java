package BinarySnacks;
import static  Function.Function.numberPower;

public class BinaryFunction {
    public static int decimalToBinary(int numbers){
        int digit = 0;
        if (numbers < 0){
            digit = numbers * -1;
        }
        else {
            digit = numbers;
        }

        StringBuilder output = new StringBuilder();

        while (digit != 0){
            int remainder = digit % 2;
            output.append(remainder);
            digit /= 2;
        }


        String result = "";

        for (int value = output.length()-1; value >= 0; value--) {
           char reverse = output.charAt(value);
           String word = String.valueOf(reverse);
           result += word;
        }

        return Integer.parseInt(result);
    }

    public static int binaryToDecimal(int numbers){
        int value;

        if (numbers < 0){
            value = numbers * -1;
        }
        else {
            value = numbers;
        }

        String convert = String.valueOf(value);

        int count = 0;
        int output = 0;
        int sumPower = 0;
        while (count < convert.length()){
            int numberValue = value / numberPower(10,count) % 10;
            count++;
            output += numberValue * numberPower(2,sumPower);
            sumPower ++;

        }

        return output;
    }
}
