package Jonathan;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] inputs) {
       StringBuilder value = new StringBuilder();

        for (int input: inputs) {
            value.append(input);
        }
        BigInteger bigInteger = new BigInteger(value.toString()).add(BigInteger.ONE);
        String output = bigInteger.toString();

        return changeToArray(output);

    }

    private static int[] changeToArray(String value){
        int[] newArray = new int[value.length()];
        for (int index2 = 0; index2 < value.length(); index2++) {
            newArray[index2] = Integer.parseInt(String.valueOf(value.charAt(index2)));
        }
        return newArray;
    }



}
