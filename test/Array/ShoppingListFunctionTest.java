package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Array.ShoppingListFunction.*;

class ShoppingListFunctionTest {

    @Test

    void testCustomer(){
        assertEquals(2,customer("2"));
        assertEquals(52,customer("52"));
    }

    @Test
    void testItem(){
        assertEquals(3,item("3"));
        assertEquals(123,item("123"));
    }


}