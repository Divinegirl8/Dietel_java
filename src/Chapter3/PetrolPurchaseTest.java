package Chapter3;


public class PetrolPurchaseTest {

    public static void main(String[] args) {
        PetrolPurchase nnpc = new PetrolPurchase("ikeja", "Gasoline" , 5 , 400.0 , 5);

        System.out.printf("The price of your petrol is %.0f " , nnpc.getPurchaseAmount());



    }

}
