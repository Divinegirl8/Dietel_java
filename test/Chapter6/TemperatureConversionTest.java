package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Chapter6.TemperatureConversion.*;

class TemperatureConversionTest {
    @Test
    void celsiusToKelvinTest(){
        assertEquals(285.45, celsiusToKelvin(12.3));
    }


    @Test
    void KelvinToCelsiusTest(){
        assertEquals(12.3, kelvinToCelsius(celsiusToKelvin(12.3)));
    }



}