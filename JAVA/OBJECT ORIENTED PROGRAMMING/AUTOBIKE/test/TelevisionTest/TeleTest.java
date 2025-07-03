package TelevisionTest;

import Television.Television;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TeleTest {

    @Test
    public void testThatTelevisonIsOff(){
        Television tele = new Television();
        tele.isOn();
        assertFalse(tele.isOn());
    }

    @Test
    public void testThatTelevisionIsOn(){
        Television tele = new Television();
        tele.isOn();
        assertFalse(tele.isOn());

        tele.toggle();
        assertTrue(tele.isOn());
    }

    @Test
    public void testThatTelevisionIsOffAfterIsOn(){
        Television tele = new Television();
        tele.isOn();
        assertFalse(tele.isOn());

        tele.toggle();
        assertTrue(tele.isOn());
        tele.toggle();
        assertFalse(tele.isOn());
    }

    @Test
    public void testThatTelevisionIsOnAfterIsOff(){
        Television tele = new Television();
        tele.isOn();
        assertFalse(tele.isOn());

        tele.toggle();
        assertTrue(tele.isOn());
        tele.toggle();
        assertFalse(tele.isOn());
    }

}
