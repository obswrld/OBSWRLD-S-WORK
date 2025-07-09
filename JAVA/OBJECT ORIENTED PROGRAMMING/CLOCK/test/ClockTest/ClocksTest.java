package ClockTest;

import Clocks.Clocck;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class ClocksTest {


    @Test
    public void testClock(){
        Clocck myClock = new Clocck(10, 30, 45);
        System.out.println(myClock);
        assertTrue(myClock.displayTime());

    }



}
