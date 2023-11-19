package Function.Shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class Mall {

    Scanner scan = new Scanner(System.in);



//    product bought validation
    private static String validateProductBought(Scanner scan){
        String product;
        boolean isValid = false;

        do {
                System.out.println("What did the user buy: ");
                product = scan.nextLine();
                if (product.matches("^[a-zA-Z0-9]*")){
                    isValid = true;
                }
                else {
                    System.out.println("Invalid!!! Enter again:");
                }

        } while (!isValid);
        return product;

    }



    // quantity validation
private static int validateQuantity(Scanner scan){
  int quantity = 0;
  boolean isValid = false;

  do {
      try {
          System.out.println("How many pieces: ");
          quantity = Integer.parseInt(scan.nextLine());
          if (quantity > 0){
              isValid = true;
          }
          else {
              System.out.println("Invalid!!! quantity must be greater than 0: ");
          }
      }
      catch (NumberFormatException e){
          System.out.println("Invalid!!! value must consist of integers only");
      }
  } while (!isValid);
  return quantity;
}


// price validation

    private static double priceValidation(Scanner scan){
        double price = 0.0;
        boolean isValid = false;

        do {
            try {
                System.out.println("How much per unit: ");
                price = Double.parseDouble(scan.nextLine());

                if (price > 0){
                   isValid = true;
                }
                else {
                    System.out.println("Invalid!!! quantity must be greater than 0: ");
                }
            }catch (NumberFormatException e){
                System.out.println("Invalid!!! value must consist of integers only");
            }
        } while (!isValid);
        return price;
    }

    // shoppers items
    private static ShoppersCart shoppersItem(Scanner scan){
        ShoppersCart cart = new ShoppersCart();

        String customerProductBought = validateProductBought(scan);
        cart.setProductBought(customerProductBought);

        int quantity = validateQuantity(scan);
        cart.setQuantity(quantity);

        double price = priceValidation(scan);
        cart.setPrice(price);

        return cart;
    }




    public static void displayInformation(ArrayList<ShoppersCart> carts){
        for (ShoppersCart items: carts){
            System.out.println(items);
        }
    }

    public static String getTotal(ArrayList<ShoppersCart> shoppersCarts){
        double result = 0;
        for (ShoppersCart cart : shoppersCarts) {
            result += cart.getPrice() * cart.getQuantity();
        }
        return String.format("%.2f",result);
    }


    private static boolean isQuestion(Scanner scan, boolean question) {
        System.out.println("Add more items: ");
        String userAnswer = scan.nextLine().toLowerCase();

        while (!userAnswer.equals("yes") && !userAnswer.equals("no")) {
            System.out.println("Invalid input. Enter 'yes' or 'no'.");
            System.out.println("Add more items? (yes/no)");
            userAnswer = scan.nextLine().toLowerCase();
        }
        if (userAnswer.equals("no")) {
            question = false;
        }
        return question;
    }


    public static void main(String[] args) {
        ArrayList<ShoppersCart> shoppersCarts = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    boolean question = true;
    System.out.println("What is the customer's name");
    String customer = scan.nextLine();

//        new ShoppersCart();
        ShoppersCart cart;

    do {
        cart = shoppersItem(scan);

        question = isQuestion(scan, question);

        shoppersCarts.add(cart);



    }while (question);

        System.out.println(ShoppersCart.headings("Joy", customer));

        displayInformation(shoppersCarts);

        System.out.println(getTotal(shoppersCarts));


    }


//    double result = 0;
//        for (int index = 0; index < shoppersCarts.size(); index++) {
//        cart = shoppersCarts.get(index);
//        result += cart.getPrice() * cart.getQuantity();
//    }
//        System.out.println(result);


}
