package Array;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean question = true;

        List<Integer> quantityList = new ArrayList<>();
        List<Double> unitList = new ArrayList<>();
        List<String> productList = new ArrayList<>();

        System.out.println("What is the customer's name");
        String customer = scan.nextLine();

        do {
            System.out.println("What did the user buy?");
            String product = scan.nextLine();

            if (product.matches("[A-Za-z0-9]+")) {
                productList.add(product);
            } else {
                System.out.println("Invalid input. Please enter a value consisting of letters");
                continue;
            }


            System.out.println("How many pieces?");
            String quantity = scan.nextLine();

            if (quantity.matches("\\d+")) {
                int quantityValue = Integer.parseInt(quantity);
                quantityList.add(quantityValue);
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }


            System.out.println("How much per unit?");
            String unit = scan.nextLine();

            if (unit.matches("\\d+")) {
                double unitValue = Double.parseDouble(unit);
                unitList.add(unitValue);
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }


            System.out.println("Add more items? (yes/no)");
            String answer = scan.nextLine().toLowerCase();


            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Invalid input. Enter 'yes' or 'no'.");
                System.out.println("Add more items? (yes/no)");
                answer = scan.nextLine().toLowerCase();
            }
            if (answer.equals("no")) {
                question = false;
            }




        } while (question);


        System.out.println("What is your name");
        String cashier = scan.nextLine();

        System.out.println("How much is the discount");
        int discount = scan.nextInt();


            List<Double> multiplyNumber = new ArrayList<>();

//            quantity multiply by price
        for (int index = 0; index < quantityList.size(); index++) {

            double resultt = quantityList.get(index) * unitList.get(index);
            multiplyNumber.add(resultt);
        }




//
        double total = 0;
        final double VAT = 17.50;

        for (int temp = 0; temp < multiplyNumber.size(); temp++) {

            total += multiplyNumber.get(temp);
        }

        double discountResult =  (total * discount) / 100;
        double vatResult = (total * VAT) / 100;
        double billTotal = total  + vatResult - discountResult;


        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String getDate = currentDate.format(formatter);




        System.out.printf("""
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
                                
        """,getDate,cashier,customer);

        for (int lop = 0; lop < productList.size();lop++){
            System.out.printf("""
                    %20s%8s%13.2f%14.2f
                    """,productList.get(lop),quantityList.get(lop),unitList.get(lop),multiplyNumber.get(lop));
        }

        System.out.printf("""
                __________________________________________________________________
                                                Sub Total:       %.2f
                                                 Discount:       %.2f
                                              VAT @ 17.50:       %.2f
                __________________________________________________________________
                __________________________________________________________________
                                               Bill Total:       %.2f
                _________________________________________________________________
                _________________________________________________________________
                THIS IS NOT A RECEIPT KINDLY PAY %.2f
                _________________________________________________________________
                """,total,discountResult,vatResult,billTotal,billTotal);


        System.out.println("How much did the customer give to you?");
        double customer_amount = scan.nextDouble();
        double balance = 0.0;

        while(customer_amount < billTotal){
            System.out.println("money is lesser than bill");
            customer_amount = scan.nextDouble();
        }
        if (customer_amount >= billTotal){
         balance = customer_amount - billTotal;}

        System.out.printf("""
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
                                
        """,getDate,cashier,customer);

        for (int lop = 0; lop < productList.size();lop++){
            System.out.printf("""
                    %20s%8s%13.2f%14.2f
                    """,productList.get(lop),quantityList.get(lop),unitList.get(lop),multiplyNumber.get(lop));
        }

        System.out.printf("""
                __________________________________________________________________
                                                Sub Total:       %.2f
                                                 Discount:       %.2f
                                              VAT @ 17.50:       %.2f
                __________________________________________________________________
                __________________________________________________________________
                                               Bill Total:       %.2f
                                              Amount Paid:       %.2f
                                                  Balance:       %.2f
                _________________________________________________________________
                _________________________________________________________________
                                  THANK YOU FOR YOUR PATRONAGE
                _________________________________________________________________
                """,total,discountResult,vatResult,billTotal,customer_amount,balance);

    }


    }

