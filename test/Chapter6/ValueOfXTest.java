package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Chapter6.ValueOfX.*;

class ValueOfXTest {
    @Test

    void testAbs(){
        double x =  Math.abs(-7.5);
         double value = Math.abs(9) + Math.ceil(2.2);
         double value2 = Math.abs(-5) + Math.abs(4);
        assertEquals(7.5,valueX(x));
        assertEquals(12,valueX(value));
        assertEquals(9,valueX(value2));
    }

    @Test
    void testFloor(){
        double x = Math.floor(5 + 2.5);
        assertEquals(7,valueX(x));
    }

    @Test

    void testCeil(){
        double x = Math.ceil(-5.2);
        assertEquals(-5,valueX(x));
    }

    @Test

    void  testCeilFloor(){
        double x = Math.ceil(-6.4) - Math.floor(5.2);
        double x2 = Math.ceil(-Math.abs(-3 + Math.floor(-2.5)));
        assertEquals(-11,valueX(x));
        assertEquals(-6,valueX(x2));
    }


}