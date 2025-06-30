package AutoBikeTest;

import AutoBikes.AutoBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutoBikeTest {

    @Test
    public void testThatIHaveABikeAndICanTurnItOnWhenItsOn(){
        AutoBike bmw = new AutoBike();
        assertEquals(false, bmw.getStatus());

        bmw.setOn();
        assertEquals(true, bmw.getStatus());
    }

    @Test
    public void testThatIHaveABikeAndICanTurnItOnWhenItsOffAndTurnItOffAgain(){
        AutoBike bmw = new AutoBike();
        assertEquals(false, bmw.getStatus());
        bmw.setOn();
        assertEquals(true, bmw.getStatus());

        bmw.setOff();
        assertEquals(false, bmw.getStatus());
    }

    @Test
    public void testThatIHaveABikeAndICanAccelerateWithGear1(){
        AutoBike bmw = new AutoBike();
        assertEquals(false, bmw.getStatus());
        bmw.setOn();
        assertEquals(true, bmw.getStatus());

        assertEquals(1, bmw.getAccelerate());
        bmw.increaseGear1(12);
        assertEquals(13, bmw.getAccelerate());
    }

    @Test
    public void testThatIHaveABikeAndICanAccelerateWithGear2(){
        AutoBike bmw = new AutoBike();
        assertEquals(false, bmw.getStatus());
        bmw.setOn();
        assertEquals(true, bmw.getStatus());

        assertEquals(1, bmw.getAccelerate());
        bmw.increaseGear2(21);
        assertEquals(23, bmw.getAccelerate());
    }

    @Test
    public void testThatIHaveABikeAndICanAccelerateWithGear3(){
        AutoBike bmw = new AutoBike();
        assertEquals(false, bmw.getStatus());
        bmw.setOn();
        assertEquals(true, bmw.getStatus());

        assertEquals(1, bmw.getAccelerate());
        bmw.increaseGear3(31);
        assertEquals(34, bmw.getAccelerate());
    }

    @Test
    public void testThatIHaveABikeAndICanAccelerateWithGear4(){
        AutoBike bmw = new AutoBike();
        assertEquals(false, bmw.getStatus());
        bmw.setOn();
        assertEquals(true, bmw.getStatus());

        assertEquals(1, bmw.getAccelerate());
        bmw.increaseGear4(41);
        assertEquals(45, bmw.getAccelerate());
    }

    @Test
    public void testThatIHaveABikeAndICanDeccelerateWithGear5(){
        AutoBike bmw = new AutoBike();
        assertEquals(false, bmw.getStatus());
        bmw.setOn();
        assertEquals(true, bmw.getStatus());

        assertEquals(1, bmw.getAccelerate());
        bmw.increaseGear1(15);
        assertEquals(16, bmw.getAccelerate());

        bmw.decreaseGear1(16);
        assertEquals(15, bmw.getAccelerate());
    }

    @Test
    public void testThatIHaveABikeAndICanDeccelerateWithGear2(){
        AutoBike bmw = new AutoBike();
        assertEquals(false, bmw.getStatus());
        bmw.setOn();
        assertEquals(true, bmw.getStatus());

        assertEquals(1, bmw.getAccelerate());
        bmw.increaseGear2(21);
        assertEquals(23, bmw.getAccelerate());

        bmw.decreaseGear2(23);
        assertEquals(21, bmw.getAccelerate());
    }

    @Test
    public void testThatIHaveABikeAndICanDeccelerateWithGear3(){
        AutoBike bmw = new AutoBike();
        assertEquals(false, bmw.getStatus());
        bmw.setOn();
        assertEquals(true, bmw.getStatus());

        assertEquals(1, bmw.getAccelerate());
        bmw.increaseGear3(35);
        assertEquals(38, bmw.getAccelerate());

        bmw.decreaseGear3(38);
        assertEquals(35, bmw.getAccelerate());
    }

    @Test
    public void testThatIHaveABikeAndICanDeccelerateWithGear4(){
        AutoBike bmw = new AutoBike();
        assertEquals(false, bmw.getStatus());
        bmw.setOn();
        assertEquals(true, bmw.getStatus());

        assertEquals(1, bmw.getAccelerate());
        bmw.increaseGear4(50);
        assertEquals(54, bmw.getAccelerate());

        bmw.decreaseGear4(54);
        assertEquals(50, bmw.getAccelerate());
    }

}
