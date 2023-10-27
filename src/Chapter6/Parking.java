package Chapter6;

public class Parking {
public static double calculateCharges(int hour){
    double minimumFee = 2.00;
    double additionalFee = minimumFee + 0.50;
    double maximumCharge = maximumCharge();

    double result = 0;
    if (hour >= 1 && hour <= 3){
        result = minimumFee;
    }

    else if(hour <= 0){
        result = 0.0;
    }

    else {
        result = additionalFee * (hour - 3);
    }

    if (result > maximumCharge){
        result = maximumCharge;
    }



    return result;

}

    public static double maximumCharge(){
        return 10.0;
    }


}
