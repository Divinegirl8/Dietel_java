package Function.Shopping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ShoppersCart {
    private int quantity;
    private double price;
    private String productBought;


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price){
        this.price =price;
    }

    public double getPrice() {
        return price;
    }

    public void setProductBought(String productBought) {
        this.productBought = productBought;
    }

    public String getProductBought() {
        return productBought;
    }

    private static String generateDate(){
        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return currentDate.format(formatter);
    }

    public static String headings(String cashier,String customer){
        return String.format("""
        SEMICOLON STORES
        MAIN BRANCH
        LOCATION: 312, HERBERT MACAULAY WAY,SABO YABA, LAGOS.
        TEL: 03293828343
        DATE: %s
        Cashier: %s
        Customer Name: %s
        ________________________________________________________________
        ________________________________________________________________
                        ITEM      QTY       PRICE       TOTAL(NGN)
                                
        """,generateDate(),cashier,customer);

    }



    @Override
    public String toString(){
        return String.format("%20s %8d %13.2f",productBought,quantity,price);
    }
}
