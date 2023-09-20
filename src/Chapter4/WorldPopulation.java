package Chapter4;

public class WorldPopulation {
    public static void main(String[] args) {
        final long INITIALPOPULATION = 8_045_311_447L;

        System.out.println("Year\tWorld Population\tNumerical Increase");
        for(int years = 1; years <= 75; years++){
            long result = (long)(INITIALPOPULATION * Math.pow(1 + 0.088,years));
            long increase = result - INITIALPOPULATION;
            System.out.println(" "+ years + "\t\t  " + result + "\t\t\t" + increase);
        }


    }
}
