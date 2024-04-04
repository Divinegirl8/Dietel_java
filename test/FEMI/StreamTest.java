package FEMI;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamTest {

    @Test void testCountLetters(){
        List<String> elements = List.of("ade","rice");
        int expected = 7;
        assertEquals(expected,Stream.countLetters(elements));
    }
    @Test void testCountLetters2(){
        List<String> elements = List.of("hi","five");
        int expected = 6;
        assertEquals(expected,Stream.countLetters(elements));
    }

    @Test void testCountLetters3(){
        List<String> elements = List.of("i","love","to","code");
        int expected = 11;
        assertEquals(expected,Stream.countLetters(elements));
    }

    @Test void testUserDetails(){
        List<String> names = List.of("divine","faith");

        List<User> user = new ArrayList<>();
        user.add(new User("divine",6));
        user.add(new User("faith",5));


   assertEquals(6,Stream.userDetail(names).get(0).getAge());
   assertEquals(5,Stream.userDetail(names).get(1).getAge());


    }

}