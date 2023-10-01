package arrayFunction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static  arrayFunction.Functions.twoList;

class TwoListTest {

    @Test
    public void testTwoList(){
        String[] letters = {"a" , "b" , "c" , "d" , "e" , "f"};
        int[] numbers = {1,2,3,4,5,6};
        String result = " [a,1,b,2,c,3,d,4,e,5,f,6]";
        assertEquals(result,twoList(letters,numbers));
    }

    @Test
    public void testTwoListTwo(){
        String[] letters = {"Dog" , "Cat" , "Unicorn" , "Fish"};
        int[] numbers = {67,45,31,40};
        String result = " [Dog,67,Cat,45,Unicorn,31,Fish,40]";
        assertEquals(result,twoList(letters,numbers));
    }

    @Test
    public void testTwoListThree(){
        String[] letters = {"a" , "b" , "c"};
        int[] numbers = {1,2,3};
        String result = " [a,1,b,2,c,3]";
        assertEquals(result,twoList(letters,numbers));
    }

}