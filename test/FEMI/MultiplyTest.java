package FEMI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {

    @Test
    public void testSecondNumberLesser() {
        int times = Multiply.multiply(2, -3);
        assertEquals(-6,times);
    }

    @Test
    public void testSecondNumberGreater() {
        int times = Multiply.multiply(-2, 3);
        assertEquals(-6,times);
    }

    @Test
    public void testPositive() {
        int times = Multiply.multiply(2, 3);
        assertEquals(6,times);
    }

}