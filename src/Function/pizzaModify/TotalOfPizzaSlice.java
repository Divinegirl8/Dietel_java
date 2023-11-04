package Function.pizzaModify;
import static  Function.pizzaModify.MultiplyPizzaSlice.*;

public class TotalOfPizzaSlice {
    public static int pizzaSliceTotal(int superHungry, int hungry, int classic){
       return calculateSuperHungrySize(superHungry) + calculateHungrySize(hungry) + calculateClassicSize(classic);
    }
}
