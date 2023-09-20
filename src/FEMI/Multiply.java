package FEMI;

//public class Multiply {
//
//    public static int multiply(int firstNumber,int secondNUmber) {
//
//        int result = 0;
//        int count;
//
//        if (secondNUmber <= 0) {
//            for (count = firstNumber; count >= 1; count--) {
//                result += secondNUmber;
//            }
//        }
//
//
//        else {
//            for (count = 1; count <= secondNUmber; count++) {
//                result += firstNumber;
//            }}
//
//            return result;
//        }
//
//
//
//}

public class Multiply {

    public static int multiply(int firstNumber,int secondNUmber) {

        int result = 0;
        int count;

        if (secondNUmber <= 0) {
          for (count = firstNumber; count >= 1; count--) {
               result += secondNUmber;
         }
       }


        if (firstNumber > secondNUmber) {
            for (count = 0; count > firstNumber; count--) {
                result -= secondNUmber;
            }
        }

        if (secondNUmber > firstNumber) {
            for (count = 0; count > secondNUmber; count--) {
                result -= firstNumber;
            }
        }


        for (count = 1; count <= secondNUmber; count++) {
            result += firstNumber;
            }




        return result;
    }



}



