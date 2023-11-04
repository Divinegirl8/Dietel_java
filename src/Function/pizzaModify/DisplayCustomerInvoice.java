package Function.pizzaModify;
import static Function.pizzaModify.DisplayMessage.*;

public class DisplayCustomerInvoice {
    public static String customerInvoice(String boxSize,int superHungry, int hungry, int classic){
        String result;


        if (boxSize.equalsIgnoreCase("Large")) {
            result = displayLarge(superHungry,hungry,classic);
        }
        else if (boxSize.equalsIgnoreCase("Medium")){
            result = displayMedium(superHungry,hungry,classic);
        }
        else if (boxSize.equalsIgnoreCase("Small")){
            result = displaySmall(superHungry,hungry,classic);
        }
        else {
            result = "Error!!! \nInput is incorrect(choose either Large or Medium or Small)";
        }
        return result;
    }

}
