package Jonathan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Jonathan.NoDuplicate.*;

class NoDuplicateTest {
    @Test void test_That_My_Function_Can_Return_A_Number_With_No_Duplicates(){
        int[] elements = {2,2,3,3,1,4,4,5,5};
        assertEquals(1,noDuplicates(elements));
     }

    @Test void test_That_My_Function_Can_Return_A_Number_With_No_Duplicates2(){
        int[] elements = {3};
        assertEquals(3,noDuplicates(elements));
    }

    @Test void test_That_My_Function_Can_Return_A_Number_With_No_Duplicates3(){
        int[] elements = {1,45,6,6,1,8,9,9};
        assertEquals(8,noDuplicates(elements));
    }

}