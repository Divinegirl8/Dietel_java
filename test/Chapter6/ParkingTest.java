package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Chapter6.Parking.*;

class ParkingTest {
    @Test

    void testOne(){
        assertEquals(0.0,calculateCharges(0));
        assertEquals(0.0,calculateCharges(-1200));
    }

    @Test
    void testTwo(){
        assertEquals(2.0,calculateCharges(2));
    }

    @Test
    void testThree(){
        assertEquals(2.5,calculateCharges(4));
    }

    @Test
    void testFour(){
        assertEquals(10.0,calculateCharges(9));
    }

    @Test
    void testFive(){
        assertEquals(7.5,calculateCharges(6));
    }


}