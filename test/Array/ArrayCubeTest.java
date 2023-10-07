package Array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static  Array.ArrayCube.cubeOfList;

class ArrayCubeTest {
    @Test

    public void testOne(){
        int[] listed = {3,7,2,6,5};
        ArrayList<Integer> result = ArrayCube.cubeOfList(listed);
        assertEquals(125,result.get(4));
        assertEquals(8,result.get(2));
    }

}