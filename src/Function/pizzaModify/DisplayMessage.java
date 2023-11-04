package Function.pizzaModify;
import static Function.pizzaModify.TotalOfPizzaSlice.*;
import static Function.pizzaModify.TotalNumberOfSlices.*;

public class DisplayMessage {
    public static String displayLarge(int superHungry, int hungry, int classic) {
        int numberOfSlices = calculateLargeTotalSlice(superHungry,hungry,classic);
        int numberOfBoxes = NumberOfBoxesRecommendation.calculateLargestSize(superHungry,hungry,classic);
        int slicesLeft = RemainingSlices.largeRemainingSlice(superHungry,hungry,classic);
        int cost = CustomerTotalPrice.customerPriceForLargeSize(superHungry,hungry,classic);



        return String.format("""
                Number of Slices: %d
                Number of Boxes: %d
                Number of Slices left: %d
                Total cost to spend: %d
                """, numberOfSlices,numberOfBoxes,slicesLeft,cost);

    }

    public static String displayMedium(int superHungry, int hungry, int classic) {
        int numberOfSlices = calculateMediumTotalSlice(superHungry,hungry,classic);
        int numberOfBoxes = NumberOfBoxesRecommendation.calculateMediumSize(superHungry,hungry,classic);
        int slicesLeft = RemainingSlices.mediumRemainingSlice(superHungry,hungry,classic);
        int cost = CustomerTotalPrice.customerPriceForMediumSize(superHungry,hungry,classic);



        return String.format("""
                Number of Slices: %d
                Number of Boxes: %d
                Number of Slices left: %d
                Total cost to spend: %d
                """, numberOfSlices,numberOfBoxes,slicesLeft,cost);

    }

    public static String displaySmall(int superHungry, int hungry, int classic) {
        int numberOfSlices = calculateSmallTotalSlice(superHungry,hungry,classic);
        int numberOfBoxes = NumberOfBoxesRecommendation.calculateSmallSize(superHungry,hungry,classic);
        int slicesLeft = RemainingSlices.smallRemainingSlice(superHungry,hungry,classic);
        int cost = CustomerTotalPrice.customerPriceForSmallSize(superHungry,hungry,classic);



        return String.format("""
                Number of Slices: %d
                Number of Boxes: %d
                Number of Slices left: %d
                Total cost to spend: %d
                """, numberOfSlices,numberOfBoxes,slicesLeft,cost);

    }
}
