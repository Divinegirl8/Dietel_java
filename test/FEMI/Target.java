package FEMI;

public class Target {
//    public static boolean target(String integers, int startIndices, int endIndices, int number){
//        char name = integers.charAt(startIndices);
//        char name2 = integers.charAt(endIndices);
//        String convert = String.valueOf(number);
//        char numb = convert.charAt(0);
//
//             if (Character.isDigit(name)) {
//                 if (name < numb && numb < name2) return true;
//             }
//
//             else if (!Character.isDigit(name)) return true;
//
//
//
//
//
//
//        return false;
//    }

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


}
