package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Chapter6.Weather.*;

class WeatherTest {
 @Test
    void testOne(){
     String expected = "It’s lovely weather for sports today!";
     assertEquals(expected,sportsRecommendation(24));
     assertEquals(expected,sportsRecommendation(20));
     assertEquals(expected,sportsRecommendation(30));

 }

 @Test

 void testTwo(){
  String expected = "It’s reasonable weather for sports today.";
  assertEquals(expected,sportsRecommendation(14));
  assertEquals(expected,sportsRecommendation(34));
 }

 @Test

 void testThree(){
  String expected = "Please exercise with care today, watch out for the weather!";
  assertEquals(expected,sportsRecommendation(189));
  assertEquals(expected,sportsRecommendation(254));
 }
}