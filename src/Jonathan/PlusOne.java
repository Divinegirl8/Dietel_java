package Jonathan;



public class PlusOne {

    public static int[] plusOne(int[] inputs) {
       String value = "";
       int convertToInteger;

        for (int input : inputs) {value += input;}
        convertToInteger = Integer.parseInt(value) + 1;

        return changeToArray(String.valueOf(convertToInteger));
    }


    private static int[] changeToArray(String value){
        int[] newArray = new int[value.length()];
        for (int index2 = 0; index2 < value.length(); index2++) {
            newArray[index2] = Integer.parseInt(String.valueOf(value.charAt(index2)));
        }
        return newArray;
    }



}
