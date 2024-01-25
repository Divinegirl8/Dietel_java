package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesisTest {
    @Test void test_That_Input_Contains_Valid_Parenthesis(){
        String input = "()";
        assertTrue(ValidParenthesis.validParenthesis(input));
    }

    @Test void test_That_Input_Contains_Valid_Parenthesis2(){
        String input = "()[]{}";
        assertTrue(ValidParenthesis.validParenthesis(input));
    }
    @Test void test_That_Input_Contains_Valid_Parenthesis3(){
        String input =  "(]";
        assertFalse(ValidParenthesis.validParenthesis(input));
    }

}