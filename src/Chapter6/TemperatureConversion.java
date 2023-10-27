package Chapter6;

public class TemperatureConversion {
public static double celsiusToKelvin(double celsius){

    return Double.parseDouble(String.format("%.2f",celsius + 273.15));
}

public static double kelvinToCelsius(double kelvin){
        return Double.parseDouble(String.format("%.2f",kelvin - 273.15));
    }
}
