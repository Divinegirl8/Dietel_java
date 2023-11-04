package Function.pizzaModify;

public enum PizzaSize {
    LARGESIZESLICE(10,0,0),
    MEDIUMSIZESLICE(0,6,0),
    SMALLSIZESLICE(0,0,4);

    private final int largeSize;
    private final int mediumSize;
    private final int smallSize;

    PizzaSize(int large,int medium,int small){
        largeSize = large;
        mediumSize = medium;
        smallSize = small;
    }

    public  int getLargeSize(){
        return largeSize;
    }

    public int getMediumSize(){
        return mediumSize;
    }

    public int getSmallSize(){
        return smallSize;
    }

    public static void main(String[] args) {
        System.out.println(PizzaSize.LARGESIZESLICE.getLargeSize());
    }


}
