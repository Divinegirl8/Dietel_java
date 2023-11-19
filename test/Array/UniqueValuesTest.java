package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Array.UniqueValues.*;
class UniqueValuesTest {
    @Test
    void testUniqueValuesRemovalWithBuiltInFunction(){
        int[] numbersWithUniqueValues = {2,2,1,1,5,9,2,3,4,3,5};
        int[] numbersWithOutUniqueValues = {2,1,5,9,3,4};
        assertArrayEquals(numbersWithOutUniqueValues,uniqueValuesRemovalWithBuiltInFunction(numbersWithUniqueValues));
    }

    @Test
    void testUniqueValuesRemovalWithoutBuiltInFunction(){
        int[] numbersWithUniqueValues = {2,2,1,1,5,9,2,3,4,3,5};
        int[] numbersWithOutUniqueValues = {2,1,5,9,3,4};
        assertArrayEquals(numbersWithOutUniqueValues,uniqueValuesRemovalWithoutBuiltInFunction(numbersWithUniqueValues));
    }

}