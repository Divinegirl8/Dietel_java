package Function;

public class PizzaFunction {
    private static final int NUMBEROFSUPERHUNGRYSLICES = 4;
    private static final int NUMBEROFHUNGRYSLICES = 2;
    private static final int NUMBEROFCLASSICSLICES = 1;

    private static final int LARGESIZESLICE = 10;
    private static final int MEDIUMSIZESLICE = 6;
    private static final int SMALLSIZESLICE = 4;

    private static final  int LARGEPRICE = 5000;
    private static final int MEDIUMPRICE = 3000;
    private static final int SMALLPRICE = 1200;


    public static String pizzaBoxSize(String value){
      return value;
    }

    public static int numberOfHungrySize(int number){
        return number;
    }
    public static int numberOfSuperHungrySize(int number){
        return number;
    }

    public static int numberOfClassicSize(int number){
        return number;
    }

    public static int calculateSuperHungrySize(int number){

        return NUMBEROFSUPERHUNGRYSLICES * numberOfSuperHungrySize(number);
    }

    public static int calculateHungrySize(int args){
        return NUMBEROFHUNGRYSLICES * numberOfHungrySize(args);
    }

    public static  int calculateClassicSize(int value){
        return NUMBEROFCLASSICSLICES * numberOfClassicSize(value);
    }

    public static int getTotalSize(int superHungerSize, int hungrySize, int classicSize){
        return  calculateSuperHungrySize(superHungerSize) + calculateHungrySize(hungrySize) + calculateClassicSize(classicSize);
    }


    public static int calculateLargestSize(int total,int large){
        int result = 0;

        if (total>=1 && total <= large){
            result = 1;
        }


        else {
            for (int index = 0; index < Integer.MAX_VALUE; index++) {
                if (index * large > total){
                    result = index;
                    break;
                }
            }
        }
        return result;
    }


    public static int calculateMediumSize(int total,int medium){
        int result = 0;

        if (total>=1 && total <= medium){
            result = 1;
        }


        else {
            for (int index = 0; index < Integer.MAX_VALUE; index++) {
                if (index * medium > total){
                    result = index;
                    break;
                }
            }
        }
        return result;
    }

    public static int calculateSmallSize(int total,int small){
        int result = 0;

        if (total>=1 && total <= small){
            result = 1;
        }


        else {
            for (int index = 0; index < Integer.MAX_VALUE; index++) {
                if (index * small > total){
                    result = index;
                    break;
                }
            }
        }
        return result;
    }

    public static int calculateLargeTotalSlice(int total){
        return total * LARGESIZESLICE;
    }
    public static int calculateMediumTotalSlice(int total){return total * MEDIUMSIZESLICE;}
    public static int calculateSmallTotalSlice(int total){return total * SMALLSIZESLICE;}

    public static int calculateLargeRemainingSlices(int total,int largeTotalSlice){
        int result;

        if (total < largeTotalSlice){
            result = largeTotalSlice - total;
        }

        else {
            result = total - largeTotalSlice;
        }
        return result;
    }

    public static int calculateMediumRemainingSlices(int total,int mediumTotalSlice){
        int result;

        if (total < mediumTotalSlice){
            result = mediumTotalSlice - total;
        }

        else {
            result = total - mediumTotalSlice;
        }
        return result;
    }

    public static int calculateSmallRemainingSlices(int total,int smallTotalSize){
        int result;

        if (total < smallTotalSize){
            result = smallTotalSize - total;
        }

        else {
            result = total - smallTotalSize;
        }
        return result;
    }

    public static int largePriceCalculation(int largestSize){
        return largestSize * LARGEPRICE;
    }
    public static int mediumPriceCalculation(int mediumSize){
        return mediumSize * MEDIUMPRICE;
    }

    public static int smallPriceCalculation(int smallSize){
        return smallSize * SMALLPRICE;
    }

public static String displayInformation(String boxSize, int numberOfSlices, int numberOfBoxes, int slicesLeft, int cost) {
    String result = "";


    if (boxSize.equalsIgnoreCase("Large")) {
       result = displayLarge(numberOfSlices,numberOfBoxes,slicesLeft,cost);
     }


   else if (boxSize.equalsIgnoreCase("Medium")) {
        result = displayMedium(numberOfSlices,numberOfBoxes,slicesLeft,cost);
    }

   else {
       result = displaySmall(numberOfSlices,numberOfBoxes,slicesLeft,cost);
    }

    return result;

}




    public static String displayLarge(int numberOfSlices, int numberOfBoxes, int slicesLeft, int cost) {

           return String.format("""
                Number of Slices: %d
                Number of Boxes: %d
                Number of Slices left: %d
                Total cost to spend: %d
                """, numberOfSlices,numberOfBoxes,slicesLeft,cost);


    }

    public static String displayMedium(int numberOfSlices, int numberOfBoxes, int slicesLeft, int cost) {

        return String.format("""
                Number of Slices: %d
                Number of Boxes: %d
                Number of Slices left: %d
                Total cost to spend: %d
                """, numberOfSlices,numberOfBoxes,slicesLeft,cost);


    }

    public static String displaySmall(int numberOfSlices, int numberOfBoxes, int slicesLeft, int cost) {

        return String.format("""
                Number of Slices: %d
                Number of Boxes: %d
                Number of Slices left: %d
                Total cost to spend: %d
                """, numberOfSlices,numberOfBoxes,slicesLeft,cost);


    }


//    public static void main(String[] args) {
//        System.out.println(displayInformation("Small", getTotalSize(4, 2, 1), calculateSmallSize(21, 4), calculateSmallRemainingSlices(calculateSmallTotalSlice(calculateSmallSize(getTotalSize(numberOfSuperHungrySize(4), numberOfHungrySize(2), numberOfClassicSize(1)), 4)), getTotalSize(numberOfSuperHungrySize(4), numberOfHungrySize(2), numberOfClassicSize(1))), smallPriceCalculation(calculateSmallSize(getTotalSize(numberOfSuperHungrySize(4), numberOfHungrySize(2), numberOfClassicSize(1)), 4))));
//    }
}
