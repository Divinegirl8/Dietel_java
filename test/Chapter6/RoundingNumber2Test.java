package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Chapter6.RoundingNumber2.*;

class RoundingNumber2Test {
@Test
    void testOne(){
    assertEquals(3.5,roundingNumberToTenth(3.5));
}

@Test
    void testTwo(){
    assertEquals(3.50,roundingNumberToHundred(3.5));
}

@Test
    void testThree(){
    assertEquals(4,roundingNumberToInteger(3.5));
}

    @Test
    void testFour(){
        assertEquals(3.500,roundingNumberToThousand(3.5));
    }



}