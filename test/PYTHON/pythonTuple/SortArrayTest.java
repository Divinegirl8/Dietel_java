package PYTHON.pythonTuple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static PYTHON.pythonTuple.SortArray.sortArrayList;

class SortArrayTest {

    @Test

    public void testOne(){
        String[] x = {"a","23","b","37","c","11","d","29"};
        String result = "[c,a,11,23,d,b,29,37]";
        assertEquals(result,sortArrayList(x));
    }

}