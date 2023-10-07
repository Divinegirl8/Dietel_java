package PYTHON.pythonTuple;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static PYTHON.pythonTuple.Unpacking.unpack;

class UnpackingTest {
    @Test
    public void testOne(){
        int[] tuple3 = {15, 25, 60, 50, 30, 40, 45, 55};
        ArrayList<Integer> result = unpack(tuple3);
        assertEquals(55,result.get(0));
        assertEquals(15,result.get(1));
    }

}