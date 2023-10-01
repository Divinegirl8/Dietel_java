package arrayFunction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static arrayFunction.Functions.twoSeperateList;

class TwoSeperateTest {

    @Test

    public void testOne(){
        String[] letter = {"a","b","c"};
        int[] numbers = {1,2,3};
        String result = "[a,b,c,1,2,3]";

        assertEquals(result,twoSeperateList(letter,numbers));
    }

    @Test

    public void testTwo(){
        String[] letter = {"i","am"};
        int[] numbers = {2};
        String result = "[i,am,2]";

        assertEquals(result,twoSeperateList(letter,numbers));
    }

    @Test

    public void testThree(){
        String[] letter = {"it","is"};
        int[] numbers = {8};
        String result = "[it,is,8]";

        assertEquals(result,twoSeperateList(letter,numbers));
    }

}