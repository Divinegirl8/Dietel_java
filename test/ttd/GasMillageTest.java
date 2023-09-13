package ttd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasMillageTest {


    @Test
    public void testMilesPerGallon(){
        GasMillage mill = new GasMillage();
        mill.setGallons(5);
        mill.setMiles(2);
        assertEquals(2.5,mill.milesPerGallon());
    }

    @Test
    public void testAddMiles() {
        GasMillage mill = new GasMillage();

        mill.setMiles(15);
        mill.setMiles(15);

        assertEquals(30,mill.getMiles());
    }

    @Test

    public void testAddGallon() {
        GasMillage mill = new GasMillage();

        mill.setGallons(2);
        mill.setGallons(2);

        assertEquals(4,mill.getGallons());
    }


    @Test

    public void  testAverage() {
        GasMillage mill = new GasMillage();

        mill.setGallons(10);
        mill.setGallons(10);
        mill.setMiles(10);
        mill.setMiles(10);
       assertEquals( 1, mill.addGallon(mill.getGallons(), mill.getMiles()));
    }

}