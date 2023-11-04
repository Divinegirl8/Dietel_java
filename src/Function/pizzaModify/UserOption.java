package Function.pizzaModify;

public class UserOption {
    private String pizzaBoxSize;
    private int numberOfSuperHungrySize;
    private int numberOfHungrySize;

    private int numberOfClassicSize;

    public void setPizzaBoxSize(String pizzaBoxSize){
        this.pizzaBoxSize = pizzaBoxSize;
    }

    public int setNumberOfSuperHungrySize(int numberOfSuperHungrySize){
        this.numberOfSuperHungrySize = numberOfSuperHungrySize;
        return numberOfSuperHungrySize;
    }

    public int setNumberOfHungrySize(int numberOfHungrySize){
        this.numberOfHungrySize = numberOfHungrySize;
        return numberOfHungrySize;
    }

    public int setNumberOfClassicSize(int numberOfClassicSize){
        this.numberOfClassicSize = numberOfClassicSize;
        return numberOfClassicSize;
    }

    public String getPizzaBoxSize() {
        return pizzaBoxSize;
    }

    public int getNumberOfSuperHungrySize() {
        return numberOfSuperHungrySize;
    }

    public int getNumberOfHungrySize() {
        return numberOfHungrySize;
    }

    public int getNumberOfClassicSize() {
        return numberOfClassicSize;
    }
}
