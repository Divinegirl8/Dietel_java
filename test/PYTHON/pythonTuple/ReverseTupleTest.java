package PYTHON.pythonTuple;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static PYTHON.pythonTuple.ReverseTuple.reversion;

class ReverseTupleTest {

    @Test

    public void testOne(){
        int[] tuple3 = {15, 25, 60, 50, 30, 40, 45, 55};
        ArrayList<Integer> list = reversion(tuple3);
        assertEquals(30,list.get(3));
        assertEquals(25,list.get(6));
    }

}