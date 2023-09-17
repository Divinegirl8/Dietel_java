package Function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class subtractTest {

    @Test
    public void firstTest() {

        int result = Function.subtract(3,7);
        assertEquals(4,result);

    }

    @Test

    public void secondTest() {
        int result = Function.subtract(7,3);
        assertEquals(4,result);
    }

}