package enumTask;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static enumTask.GeoPoliticalZones.*;

class GeoPoliticalZonesTest {

    @Test

    void testValuesLength(){
        GeoPoliticalZones[] zones = values();
        assertEquals(6,zones.length);
    }

@Test

void showZone(){
    assertSame(SOUTHEAST,displayZone("Imo"));
    assertSame(SOUTHSOUTH,displayZone("Delta"));
    assertSame(SOUTHWEST,displayZone("Ekiti"));
    assertSame(NORTHWEST,displayZone("Sokoto"));
    assertSame(NORTHEAST,displayZone("Borno"));

}




    }
