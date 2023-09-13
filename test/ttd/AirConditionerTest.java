package ttd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class AirConditionerTest {

    @Test
    public  void onTest() {

        AirConditioner samsung = new AirConditioner();

        samsung.toggle();
        assertTrue(samsung.checkIsOn());
    }




    @Test
    public void offTest() {

        AirConditioner samsung = new AirConditioner();

        samsung.toggle();
        samsung.toggle();
        samsung.increaseTemperature();
        samsung.decreaseTemperature();
        assertFalse(samsung.checkIsOn());

    }




    @Test
    public void increaseTemperatureTest() {
        AirConditioner samsung = new AirConditioner();

        samsung.toggle();

        for (int temperature = 16; temperature < 20; temperature++){

            samsung.increaseTemperature();
        }

      assertEquals(20, samsung.checkTemperature());

    }

    @Test
    public void decreaseTemperatureTest() {

        AirConditioner samsung = new AirConditioner();

        samsung.toggle();

        for (int temperature = 16; temperature < 19; temperature++){

            samsung.increaseTemperature();
        }

        samsung.decreaseTemperature();
        assertEquals(18, samsung.checkTemperature());

    }


    @Test
    public  void beyondTemperature(){

        AirConditioner samsung = new AirConditioner();

        samsung.toggle();

        for (int temperature = 16; temperature <= 30; temperature++ ) {

            samsung.increaseTemperature();

        }
        assertEquals(30, samsung.checkTemperature());

    }

    @Test
    public void belowTemperature() {
        AirConditioner samsung = new AirConditioner();

        samsung.toggle();
        samsung.decreaseTemperature();
        assertEquals(16,samsung.checkTemperature());
    }



   }



