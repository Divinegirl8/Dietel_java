package Function.pizzaModify;
import static Function.pizzaModify.TotalNumberOfSlices.*;
import static Function.pizzaModify.TotalOfPizzaSlice.*;

public class RemainingSlices {
    public static int largeRemainingSlice(int superHungry, int hungry, int classic){
        int result;
        if (calculateLargeTotalSlice(superHungry,hungry,classic) < pizzaSliceTotal(superHungry,hungry,classic)){
            result = pizzaSliceTotal(superHungry,hungry,classic) - calculateLargeTotalSlice(superHungry,hungry,classic);
        }

        else {
            result = calculateLargeTotalSlice(superHungry,hungry,classic) - pizzaSliceTotal(superHungry,hungry,classic);
        }

        return result;
    }

    public static int mediumRemainingSlice(int superHungry, int hungry, int classic){
        int result;
        if (calculateMediumTotalSlice(superHungry,hungry,classic) < pizzaSliceTotal(superHungry,hungry,classic)){
            result = pizzaSliceTotal(superHungry,hungry,classic) - calculateMediumTotalSlice(superHungry,hungry,classic);
        }

        else {
            result = calculateMediumTotalSlice(superHungry,hungry,classic) - pizzaSliceTotal(superHungry,hungry,classic);
        }

        return result;
    }

    public static int smallRemainingSlice(int superHungry, int hungry, int classic){
        int result;
        if (calculateSmallTotalSlice(superHungry,hungry,classic) < pizzaSliceTotal(superHungry,hungry,classic)){
            result = pizzaSliceTotal(superHungry,hungry,classic) - calculateSmallTotalSlice(superHungry,hungry,classic);
        }

        else {
            result = calculateSmallTotalSlice(superHungry,hungry,classic) - pizzaSliceTotal(superHungry,hungry,classic);
        }

        return result;
    }




}
