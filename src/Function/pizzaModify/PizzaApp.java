package Function.pizzaModify;
import javax.swing.*;

import static Function.pizzaModify.DisplayCustomerInvoice.*;

public class PizzaApp {
    public static void main(String[] args) {
        JOptionPane.showInternalMessageDialog(null,"Welcome to Luchy\'s Pizza Shop \nKindly place your order: ");
       String boxSize = JOptionPane.showInputDialog(null,"Choose the Pizza Box Size (Large,Medium,Small): ");

       while (boxSize.matches("\\d+") || !(boxSize.equalsIgnoreCase("Large") || boxSize.equalsIgnoreCase("Medium") || boxSize.equalsIgnoreCase("Small"))){
           boxSize = JOptionPane.showInputDialog(null,"Error!!! \nChoose the Pizza Box Size (Large,Medium,Small): ");
       }



       String superHungry = JOptionPane.showInputDialog(null,"Number of Super Hungry: ");

       while (!superHungry.matches("\\d+")){
           superHungry = JOptionPane.showInputDialog(null,"Error!!! \nValue must consist of positive digits only \nNumber of Super Hungry: ");
       }

       int convertSuperHungry = Integer.parseInt(superHungry);




        String hungry = JOptionPane.showInputDialog(null,"Number of Hungry: ");

        while (!hungry.matches("\\d+")){
            hungry = JOptionPane.showInputDialog(null,"Error!!! \nValue must consist of positive digits only \nNumber of Hungry: ");
        }

        int convertHungry = Integer.parseInt(hungry);




        String classic = JOptionPane.showInputDialog(null,"Number of Classic: ");

        while (!classic.matches("\\d+")){
            classic = JOptionPane.showInputDialog(null,"Error!!! \nValue must consist of positive digits only \nNumber of Classic: ");
        }

        int convertClassic = Integer.parseInt(classic);


        JOptionPane.showInternalMessageDialog(null,customerInvoice(boxSize,convertSuperHungry,convertHungry,convertClassic));

    }
}
