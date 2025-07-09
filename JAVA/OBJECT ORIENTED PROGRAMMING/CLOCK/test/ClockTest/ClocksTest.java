package ClockTest;

import Clocks.Clocck;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClocksTest {


    @Test
    public void testClock(){
        Clocck myClock = new Clocck(10, 30, 45);
        System.out.println(myClock);
        assertTrue(myClock.displayTime(10, 30, 45));
    }

    @Test
    public void testClockChecksForValidation(){
        Clocck myClock = new Clocck(70, 70, 70);
        System.out.println(myClock);
        assertTrue(myClock.displayTime(0,0,0));
    }

    @Test
    public void testClockChecksForHourValidation(){
        Clocck myClock = new Clocck(70, 30, 40);
        System.out.println(myClock);
        assertTrue(myClock.displayTime(0,30,40));
    }

    @Test
    public void testClockChecksForMinuteValidation(){
        Clocck myClock = new Clocck(20, 70, 40);
        System.out.println(myClock);
        assertTrue(myClock.displayTime(20,0,40));
    }

    @Test
    public void testClockChecksForSecondValidation(){
        Clocck myClock = new Clocck(20, 20, 70);
        System.out.println(myClock);
        assertTrue(myClock.displayTime(20,20,0));
    }



}
