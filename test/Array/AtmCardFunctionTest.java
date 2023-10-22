package Array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static Array.AtmCardFunction.*;

class AtmCardFunctionTest {
    @Test
    void testOne(){
        ArrayList<Long> result = pickOffValue(-1234);
        assertEquals(4,result.get(0));
        assertEquals(1,result.get(3));
    }



}