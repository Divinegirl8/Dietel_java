package Function.pizzaModify;
import static Function.pizzaModify.NumberOfBoxesRecommendation.*;

public class CustomerTotalPrice {
    public static int customerPriceForLargeSize(int superHungry, int hungry, int classic){
        PizzaPrice pizzaPrice = PizzaPrice.LARGESIZEPRICE;
        return calculateLargestSize(superHungry,hungry,classic) * pizzaPrice.getLarge();
    }

    public static int customerPriceForMediumSize(int superHungry, int hungry, int classic){
        PizzaPrice pizzaPrice = PizzaPrice.MEDIUMSIZEPRICE;
        return calculateMediumSize(superHungry,hungry,classic) * pizzaPrice.getMedium();
    }

    public static int customerPriceForSmallSize(int superHungry, int hungry, int classic){
        PizzaPrice pizzaPrice = PizzaPrice.SMALLSIZEPRICE;
        return calculateSmallSize(superHungry,hungry,classic) * pizzaPrice.getSmall();
    }

}
