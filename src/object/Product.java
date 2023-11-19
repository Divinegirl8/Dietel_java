package object;

public class Product {

    private int quantity;
    private double price;
    private String name;

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString(){
        return String.format("%s  %s   %s   %s",name, quantity, price, price * quantity);
    }
}
