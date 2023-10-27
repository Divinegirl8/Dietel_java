package Array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static Array.AtmCardFunction.*;

class AtmCardFunctionTest {
    @Test
    void testOne(){
        String number = "-4388576018402626";
        long[] result = pickOffValue(Long.parseLong(number));
        long[] expected = {6, 2, 6, 2, 0, 4, 8, 1, 0, 6, 7, 5, 8, 8, 3, 4};
        assertArrayEquals(expected,result);
    }

    @Test
    void testPickOffTwo(){
        String number = "5399831619690403";
        long[] result = pickOffValue(Long.parseLong(number));
        long[] expected = {3, 0, 4, 0, 9, 6, 9, 1, 6, 1, 3, 8, 9, 9, 3, 5};
        assertArrayEquals(expected,result);
    }

@Test
    void testTwo(){
 String number = "-4388576018402626";
    long[] result = pickOffValue(Long.parseLong(number));
 int value = evenPosition(result);
 assertEquals(37,value);
}

@Test
 void testEvenPosition(){
    String number = "5399831619690403";
    long[] result = pickOffValue(Long.parseLong(number));
    int value = evenPosition(result);
   assertEquals(24,value);
}

@Test
    void testOddPositionTotal() {
    String number = "-4388576018402626";
    long[] result = pickOffValue(Long.parseLong(number));
    int expected = oddPosition(result);
    assertEquals(38,expected);
}

@Test
    void testOddPositionTotalTwo() {
        String number =  "5399831619690403";
        long[] result = pickOffValue(Long.parseLong(number));
        int expected = oddPosition(result);
        assertEquals(46,expected);
    }

@Test
    void testTotal(){
    String number = "-4388576018402626";
    long[] result = pickOffValue(Long.parseLong(number));
    int expected = addOddEvenPosition(evenPosition(result),oddPosition(result));

    assertEquals(75,expected);
}

@Test

void testTotalTwo(){
    String number =  "5399831619690403";
    long[] result = pickOffValue(Long.parseLong(number));
    int expected = addOddEvenPosition(evenPosition(result),oddPosition(result));
    assertEquals(70,expected);

}


@Test
    void testFirstIndexPositive() {
    String number = "4388576018402626";
    long expected = getFirstIndexPosition(number);
    assertEquals(4,expected);
}

    @Test
    void testFirstIndexNegative() {
        String number = "-4388576018402626";
        long expected = getFirstIndexPosition(number);
        assertEquals(4,expected);
    }

    @Test
    void testSecondDigitPositive(){
        String number = "4388576018402626";
        long expected = getSecondIndex(number);
        assertEquals(3,expected);
    }

    @Test
    void testSecondDigitNegative(){
        String number = "-4388576018402626";
        long expected = getSecondIndex(number);
        assertEquals(3,expected);
    }

    @Test

    void testIsDivisibleBy10(){
        String number =  "5399831619690403";
        long[] result = pickOffValue(Long.parseLong(number));
        int total = addOddEvenPosition(evenPosition(result),oddPosition(result));
        assertTrue(isDivisibleBy10(total));
    }

    @Test

    void testIsNotDivisibleBy10(){
        String number = "-4388576018402626";
        long[] result = pickOffValue(Long.parseLong(number));
        int expected = addOddEvenPosition(evenPosition(result),oddPosition(result));
        assertFalse(isDivisibleBy10(expected));
    }

    @Test
    void testIsNotDivisibleBy10Two(){
        String number = "4388576018402626";
        long[] result = pickOffValue(Long.parseLong(number));
        int expected = addOddEvenPosition(evenPosition(result),oddPosition(result));
        assertFalse(isDivisibleBy10(expected));
    }

    @Test

    void testGenerate(){
        String cardType = "Test Card";
        long cardNUmber = Long.parseLong("12345678912");
        String status = "Test Validity";
        String expected = """
                *****************************************
                **Credit Card Type: Test Card
                **Credit Card Number: 12345678912
                **Credit Card Digit Length:  11
                **Credit Card Validity Status: Test Validity
                ********************************************
                """;

        String value = generateOutput(cardType,cardNUmber,status);
        assertEquals(expected,value);
    }

    @Test

    void testMasterCard(){
        String number =  "5399831619690403";
        long[] result = pickOffValue(Long.parseLong(number));
        String value = isMasterCard(Long.parseLong(number),addOddEvenPosition(evenPosition(result),oddPosition(result)));
        String expected = """
                *****************************************
                **Credit Card Type: MasterCard
                **Credit Card Number: 5399831619690403
                **Credit Card Digit Length:  16
                **Credit Card Validity Status: Valid
                ********************************************
                """;
        assertEquals(expected,value);
    }

    @Test

    void testMasterCardInvalid(){
        String number =  "5388576018402626";
        long[] result = pickOffValue(Long.parseLong(number));
        String value = isMasterCard(Long.parseLong(number),addOddEvenPosition(evenPosition(result),oddPosition(result)));
        String expected = """
                *****************************************
                **Credit Card Type: MasterCard
                **Credit Card Number: 5388576018402626
                **Credit Card Digit Length:  16
                **Credit Card Validity Status: Invalid
                ********************************************
                """;
        assertEquals(expected,value);
    }

    @Test

    void testVisaCardInvalid(){
        String number =  "4388576018402626";
        long[] result = pickOffValue(Long.parseLong(number));
        String value = isVisaCard(Long.parseLong(number),addOddEvenPosition(evenPosition(result),oddPosition(result)));

        String expected = """
                *****************************************
                **Credit Card Type: VisaCard
                **Credit Card Number: 4388576018402626
                **Credit Card Digit Length:  16
                **Credit Card Validity Status: Invalid
                ********************************************
                """;
        assertEquals(expected,value);
    }

    @Test

    void testVisaCardIsValid(){
        String number =  "4388576018410707";
        long[] result = pickOffValue(Long.parseLong(number));
        String value = isVisaCard(Long.parseLong(number),addOddEvenPosition(evenPosition(result),oddPosition(result)));

        String expected = """
                *****************************************
                **Credit Card Type: VisaCard
                **Credit Card Number: 4388576018410707
                **Credit Card Digit Length:  16
                **Credit Card Validity Status: Valid
                ********************************************
                """;
        assertEquals(expected,value);
    }


    @Test

    void testDiscoverCardInvalid(){
        String number =  "6388570018402626";
        long[] result = pickOffValue(Long.parseLong(number));
        String value = isDiscoverCard(Long.parseLong(number),addOddEvenPosition(evenPosition(result),oddPosition(result)));

        String expected = """
                *****************************************
                **Credit Card Type: DiscoverCard
                **Credit Card Number: 6388570018402626
                **Credit Card Digit Length:  16
                **Credit Card Validity Status: Invalid
                ********************************************
                """;
        assertEquals(expected,value);
    }


    @Test

    void testAmericanExpressCardInvalid(){
        String number =  "3720690186237233";
        long[] result = pickOffValue(Long.parseLong(number));
        String value = isAmericanExpressCard(Long.parseLong(number),addOddEvenPosition(evenPosition(result),oddPosition(result)));

        String expected = """
                *****************************************
                **Credit Card Type: AmericanExpressCard
                **Credit Card Number: 3720690186237233
                **Credit Card Digit Length:  16
                **Credit Card Validity Status: Invalid
                ********************************************
                """;
        assertEquals(expected,value);
    }


    @Test

    void CardIsInvalid(){
        String number =  "2720690186237233";
        long[] result = pickOffValue(Long.parseLong(number));
        String value = notValid(Long.parseLong(number),addOddEvenPosition(evenPosition(result),oddPosition(result)));

        String expected = """
                *****************************************
                **Credit Card Type: InvalidCard
                **Credit Card Number: 2720690186237233
                **Credit Card Digit Length:  16
                **Credit Card Validity Status: Invalid
                ********************************************
                """;
        assertEquals(expected,value);
    }

}