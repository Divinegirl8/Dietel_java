package Function.pizzaModify;

public enum AppetiteSlice {
    NUMBEROFSUPERHUNGRYSLICES(4, 0, 0),
    NUMBEROFHUNGRYSLICES(0, 2, 0),
    NUMBEROFCLASSICSLICES(0, 0, 1);

    private final int superHungry;

    private final int hungry;
    private final int classic;

    AppetiteSlice(int superHungry, int hungry, int classic) {
        this.superHungry = superHungry;
        this.hungry = hungry;
        this.classic = classic;
    }



    public int getSuperHungry() {
        return superHungry;
    }

    public int getHungry() {
        return hungry;
    }

    public int getClassic() {
        return classic;
    }


    public static void main(String[] args) {
        AppetiteSlice myColor = AppetiteSlice.NUMBEROFSUPERHUNGRYSLICES;
        System.out.println("Color: " + myColor);
        System.out.println("Red component: " + myColor.getSuperHungry());

        System.out.println("Green component: " + AppetiteSlice.NUMBEROFHUNGRYSLICES.getHungry());
        System.out.println("Blue component: " + AppetiteSlice.NUMBEROFCLASSICSLICES.getClassic());
    }
}