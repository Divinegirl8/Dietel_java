package Function.pizzaModify;

public class MultiplyPizzaSlice {
    public static int calculateSuperHungrySize(int superHungry){
        AppetiteSlice appetiteSlice = AppetiteSlice.NUMBEROFSUPERHUNGRYSLICES;
        UserOption userOption = new UserOption();
        userOption.setNumberOfSuperHungrySize(superHungry);

        int result;

        if (userOption.getNumberOfSuperHungrySize() >= 1){
            result = appetiteSlice.getSuperHungry() *  userOption.getNumberOfSuperHungrySize();
        }
        else {result = 0;}

        return result;
    }

    public static int calculateHungrySize(int hungry){
        AppetiteSlice appetiteSlice = AppetiteSlice.NUMBEROFHUNGRYSLICES;
        UserOption userOption = new UserOption();
        userOption.setNumberOfHungrySize(hungry);

        int result;

        if (userOption.getNumberOfHungrySize() >= 1){
            result =  appetiteSlice.getHungry() * userOption.getNumberOfHungrySize();
        }

        else {
            result = 0;
        }

        return result;
    }

    public static  int calculateClassicSize(int classic){
        AppetiteSlice appetiteSlice = AppetiteSlice.NUMBEROFCLASSICSLICES;
        UserOption userOption = new UserOption();
        userOption.setNumberOfClassicSize(classic);

        int result;

        if (userOption.getNumberOfClassicSize() >= 1){
            result = appetiteSlice.getClassic() * userOption.getNumberOfClassicSize();
        }

        else {
            result = 0;
        }

        return result;
    }
}
