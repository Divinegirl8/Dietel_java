package Function.pizzaModify;

public class NumberOfBoxesRecommendation {

    public static int calculateLargestSize(int superHungry, int hungry, int classic){
        int result = 0;
        PizzaSize pizzaSize = PizzaSize.LARGESIZESLICE;
        int large = pizzaSize.getLargeSize();
        int total = TotalOfPizzaSlice.pizzaSliceTotal(superHungry,hungry,classic);

        if (total>=1 && total <= large){
            result = 1;
        }


        else {
            for (int index = 0; index < Integer.MAX_VALUE; index++) {
                if (total>=1 && index * large >= total){
                    result = index;
                    break;
                }
            }
        }
        return result;
    }


    public static int calculateMediumSize(int superHungry, int hungry, int classic){
        int result = 0;
        PizzaSize pizzaSize = PizzaSize.MEDIUMSIZESLICE;
        int medium = pizzaSize.getMediumSize();
        int total = TotalOfPizzaSlice.pizzaSliceTotal(superHungry,hungry,classic);

        if (total>=1 && total <= medium){
            result = 1;
        }


        else {
            for (int index = 0; index < Integer.MAX_VALUE; index++) {
                if (total>=1 && index * medium >= total){
                    result = index;
                    break;
                }
            }
        }
        return result;
    }

    public static int calculateSmallSize(int superHungry, int hungry, int classic){
        int result = 0;
        PizzaSize pizzaSize = PizzaSize.SMALLSIZESLICE;
        int small = pizzaSize.getSmallSize();
        int total = TotalOfPizzaSlice.pizzaSliceTotal(superHungry,hungry,classic);

        if (total>=1 && total <= small){
            result = 1;
        }


        else {
            for (int index = 0; index < Integer.MAX_VALUE; index++) {
                if (total>=1 && index * small >= total){
                    result = index;
                    break;
                }
            }
        }
        return result;
    }
}
