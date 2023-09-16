package SnackTwo;


import Function.Function;

public class Table {
    public static void main(String[] args) {

        for (int count = 1; count <= 5; count++){
            int secondColumn = count + 1;

             int result = Function.numberPower(count,secondColumn);


                System.out.println(count + "\t" + secondColumn + "\t" + result);



        }
    }

}
