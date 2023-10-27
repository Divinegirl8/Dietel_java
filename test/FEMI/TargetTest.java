package FEMI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static FEMI.Target.*;

class TargetTest {

    @Test

    void testOne(){
        assertTrue(target(1-3579,1,2,4));
        assertFalse(target(13579,1,2,10));
        assertTrue(target(179,1,2,8));
        assertTrue(target(246,1,2,5));
        assertTrue(target(1-35794567,1,2,4));
        assertTrue(target(1-352,1,2,4));

      
    }

}