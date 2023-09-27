package Chapter5;

public class ModifyCompoundInterest {
    public static void main(String[] args) {
        int principal = 1000;
        double rate = (double)5 / 100;
        int compoundingFrequently = 4;
        double annual = 0;
        for (int count = 1; count <= 3; count++){
             annual = 100_000 * (Math.pow(1 + (rate / compoundingFrequently),(compoundingFrequently * count))) - 100_000;

        }

        System.out.println(annual);
    }
}
