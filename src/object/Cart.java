package object;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String userInput = "yes";
        while (userInput.equalsIgnoreCase("Yes")){
            Product newProduct = new Product();
            System.out.println("Enter your product name");
            newProduct.setName(input.nextLine());
            System.out.println("Enter the quantity ");
            newProduct.setQuantity(Integer.parseInt(input.nextLine()));
            System.out.println("Enter the price: ");
            newProduct.setPrice(Double.parseDouble(input.nextLine()));
            products.add(newProduct);
            System.out.println("Enter no to stop or yes to continue");
            userInput = input.nextLine();
        }

        for (Product product: products) {
            System.out.println(product);
        }
    }
}
