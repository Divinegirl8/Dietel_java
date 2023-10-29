package FEMI;

public class Target {


    public static boolean target(int integers, int startIndices, int endIndices, int number){
        String convert = String.valueOf(integers);
        String targetNumber = String.valueOf(number);

        char index1 = convert.charAt(startIndices);
        char index2 = convert.charAt(endIndices);
        char targetInt = targetNumber.charAt(0);

            if (Character.isDigit(index1)){
                return index1 < targetInt && targetInt < index2;
            }
            else if (Character.isLetter(index1)) {
                return ((index1 + 1) < targetInt && targetInt < (index2 + 1));
            }

   return false;
    }


//    public static boolean target(int integers, int startIndices, int endIndices, int number){
//        int makeAbs = Math.abs(integers);
//        String convert = String.valueOf(makeAbs);
//        String targetNumber = String.valueOf(number);
//
//        char index1 = convert.charAt(startIndices);
//        char index2 = convert.charAt(endIndices);
//        char targetInt = targetNumber.charAt(0);
//
//        return index1 < targetInt && targetInt < index2;
//    }


}
