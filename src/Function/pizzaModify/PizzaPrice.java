package Function.pizzaModify;

public enum PizzaPrice {
    LARGESIZEPRICE(5000,0,0),
    MEDIUMSIZEPRICE(0,3000,0),
    SMALLSIZEPRICE(0,0,1200);

    private final int large;
    private final int medium;
    private final int small;
    PizzaPrice(int large, int medium, int small){
        this.large = large;
        this.medium = medium;
        this.small = small;
    }

    public  int getLarge(){
        return large;
    }

    public int getMedium(){
        return medium;
    }

    public int getSmall(){
        return small;
    }



}
