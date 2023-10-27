package Chapter6;

import java.util.Scanner;
import static Chapter6.TemperatureConversion.*;

public class TemperatureConversionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a celsius to determine it kelvin equivalent: ");
        double number = scanner.nextDouble();



        System.out.println("The celsius equivalent of " + number + " is " + kelvinToCelsius(celsiusToKelvin(number)));
    }
}
