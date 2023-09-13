package PYTHON;

public class CompoundInterest {
    public static void main(String[] args) {

        int principal = 1000;
        double rate = 0.07;

        for (int years = 1; years <= 30; years++){
            double amount = principal * Math.pow(1 + 0.07 , years);
            System.out.printf("The amount in %d years is %.1f%n",years,amount);
        }



    }
}
