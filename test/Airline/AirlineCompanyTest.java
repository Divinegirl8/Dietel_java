package Airline;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AirlineCompanyTest {

    @Test

    void seatsHasTenFreeSpace(){
        AirlineSeat company = new AirlineSeat();
        boolean[] seats = company.getSeats();
        assertEquals(10,seats.length);
        System.out.println(Arrays.toString(seats));
    }

}