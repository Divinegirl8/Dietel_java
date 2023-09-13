package Chapter3;


public class PetrolPurchase {
    private String location;
    private String petrolType;
    private int quantity;
    private double petrolPrice;
    private double percentageDiscount;

    public PetrolPurchase(String location, String petrolType , int quantity, double petrolPrice , double percentageDiscount ) {

        this.location = location;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.petrolPrice = petrolPrice;
        this.percentageDiscount = percentageDiscount;

    }

    public void setLocation(String location) {
        this.location = location;

    }

    public String  getLocation(){
        return location;
    }



    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;

    }

    public  String getPetrolType(){
        return petrolType;
    }



    public void setQuantity(int quantity) {
        this.quantity = quantity;

    }

    public int getQuantity() {
        return  quantity;
    }



    public void setPetrolPrice(double petrolPrice) {
        this.petrolPrice = petrolPrice;

    }

    public double getPetrolPrice() {
        return  petrolPrice;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;

    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public double getPurchaseAmount(){
        return quantity * petrolPrice - percentageDiscount;

    }

}
