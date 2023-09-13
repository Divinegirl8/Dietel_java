package ttd;

public class GasMillage {
    private int gallons = 0;
    private  int miles = 0;

    public void setGallons(int gallons) {

        this.gallons += gallons;
    }

    public int getGallons() {
        return gallons;
    }


    public void setMiles(int miles) {
        this.miles += miles;
    }

    public int getMiles() {
        return miles;
    }


    public  float milesPerGallon() {
       return (float) gallons / miles;
    }

    public double addGallon(double gallons, double miles ) {
// todo        int sum = 0;
//        sum += gallons;
//        System.out.println(sum);
//        miles += miles;
//        return (float) gallons / miles;
//        return sum;
        return gallons /miles;
    }








}
