package Function.pizzaModify;
import static Function.pizzaModify.NumberOfBoxesRecommendation.*;

public class TotalNumberOfSlices {

    public static int calculateLargeTotalSlice(int superHungry, int hungry, int classic){
        PizzaSize pizzaSize = PizzaSize.LARGESIZESLICE;
        return pizzaSize.getLargeSize() * calculateLargestSize(superHungry,hungry,classic);


    }

    public static int calculateMediumTotalSlice(int superHungry, int hungry, int classic){
        PizzaSize pizzaSize = PizzaSize.MEDIUMSIZESLICE;
        return pizzaSize.getMediumSize() * calculateMediumSize(superHungry,hungry,classic);
    }

    public static int calculateSmallTotalSlice(int superHungry, int hungry, int classic){
        PizzaSize pizzaSize = PizzaSize.SMALLSIZESLICE;
        return pizzaSize.getSmallSize() * calculateSmallSize(superHungry,hungry,classic);
    }
}
