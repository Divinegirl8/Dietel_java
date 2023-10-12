package Array;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean question = true;


        ArrayList<String> productList = new ArrayList<>();
        ArrayList<String> quantityList = new ArrayList<>();
        ArrayList<String> unitList = new ArrayList<>();


        System.out.println("What is the customer's name");
        String customer = scan.nextLine();


        do {

            System.out.println("What did the user buy?");
            String product = scan.nextLine();
            productList.add(product);

            System.out.println("How many pieces?");
            String quantity = scan.nextLine();
            quantityList.add(quantity);

            System.out.println("How much per unit?");
            String unit = scan.nextLine();
            unitList.add(unit);

            System.out.println("Add more item?");
            String answer = scan.nextLine();

            String convert = answer.toLowerCase();
            if (convert.equals("no")){
                question = false;
            }


        }while (question);

        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String getDate = currentDate.format(formatter);

        System.out.printf("""
        SEMICOLON STORES
        MAIN BRANCH
        LOCATION: 312, HERBERT MACAULAY WAY,SABO YABA, LAGOS.
        TEL: 03293828343
        DATE: %s
        Cashier: Cashier's Name
        Customer Name: %s
        ________________________________________________________________
        ________________________________________________________________
                   ITEM       QTY    PRICE     TOTAL(NGN)
                   %s         %s     %s
                    
                
                """,getDate,customer
        );
    }
}
