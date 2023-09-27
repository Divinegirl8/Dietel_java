package Chapter5;

public class ModifyCompoundInterest {
    public static void main(String[] args) {
        int principal = 1000;
//        convert to penny, 1 penny is equivalent to 1 cent, 100 cent is 1 dollar
        int penny = principal * 100;

        double rate = (double)5 / 100;
        int compoundingFrequently = 4;
        double annual = 0;
        for (int count = 1; count <= 10; count++){
             annual = penny * Math.pow(1 + rate / compoundingFrequently,compoundingFrequently * count);
        }

        int dollar = (int)annual / 100;
        int cent = (int)annual % 100;

        System.out.printf("The compounded interest is $%d.%d cents",dollar,cent);

    }
}
