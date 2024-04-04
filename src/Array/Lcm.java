package Array;

public class Lcm {
    public static boolean checkForOne(int... elements){
        for (int element : elements){
            if (element != 1) { return true; }
        }
        return false;
    }

    public static int lcm(int... elements){
        int multiply = 1;
        int divide = 2;
        while (checkForOne(elements)){
            boolean isDivisible = false;
            for (int index = 0; index < elements.length; index++){
                if (elements[index] % divide == 0){
                    isDivisible = true;
                    elements[index] /= divide;
                }
            }
            if (isDivisible){
                multiply *= divide;
            }
            else {
                divide++;
            }
        }
        return multiply;
    }


}
