package ClockTest;

import org.junit.jupiter.api.Test;

import java.time.Clock;

public class ClocksTest {

    @Test
    public void testThatClocksSecondMinutesAndHourIsWorking(){
        Clock myClock = Clock.systemDefaultZone();
    }
}
