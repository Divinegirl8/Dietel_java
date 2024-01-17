package FEMI.phaseGate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static FEMI.phaseGate.OddPosition.*;

class OddPositionTest {
    @Test void array_Can_Return_Elements_In_The_Odd_Position(){
        int[] elements = {45,34,21,3,4,5,22};
        int[] result = {34,3,5};
        assertArrayEquals(result,oddPosition(elements));
    }

    @Test void array_Can_Return_Elements_In_The_Odd_Position2(){
        int[] elements = {1,2,3};
        int[] result = {2};
        assertArrayEquals(result,oddPosition(elements));
    }

}