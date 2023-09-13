package ttd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomaticBikeTest {



    @Test
    public void onTest() {
        AutomaticBike bike = new AutomaticBike();

        bike.keyHole();
        assertTrue(bike.checkToggle());

    }

    @Test
    public void offTest() {
        AutomaticBike bike = new AutomaticBike();

        bike.keyHole();
        assertTrue(bike.checkToggle());
        bike.keyHole();
        assertFalse(bike.checkToggle());

    }


    @Test

    public void accelerateTest() {

        AutomaticBike bike = new AutomaticBike();
        bike.keyHole();

      for(int gear = 0; gear < 20; gear++) {

          bike.acceleration();

      }
        for(int gear = 21; gear < 25; gear++) {

            bike.acceleration();

        }

        for(int gear = 26; gear < 30; gear++) {

            bike.acceleration();

        }

assertEquals(4, bike.getGear());
      assertEquals(46, bike.getSpeed());


    }

    @Test

    public void decelerationTest() {

        AutomaticBike bike = new AutomaticBike();

        bike.keyHole();


for (int speed = 0; speed < 20; speed++){

    bike.acceleration();

}
        for (int speed = 21; speed <= 25; speed++){

            bike.acceleration();

        }
        bike.deceleration();
assertEquals(28, bike.getSpeed());
assertEquals(2, bike.getGear());

    }



}