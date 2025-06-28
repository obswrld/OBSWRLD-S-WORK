package ACTest;

import AirConditioner.AirConditioner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    public void testThatACCanTurnOn(){
        AirConditioner LGAirConditioner = new AirConditioner();
        assertEquals(false, LGAirConditioner.getStatus());

        LGAirConditioner.setOn();
        assertEquals(true, LGAirConditioner.getStatus());
    }

    @Test
    public void testThatACCanTurnOff(){
        AirConditioner LGAirConditioner = new AirConditioner();
        LGAirConditioner.setOn();
        assertEquals(true, LGAirConditioner.getStatus());

        LGAirConditioner.setOff();
        assertEquals(false, LGAirConditioner.getStatus());
    }

    @Test
    public void testThatACCanBeIncrease(){
        AirConditioner LGAirConditioner = new AirConditioner();
        assertEquals(false, LGAirConditioner.getStatus());
        LGAirConditioner.setOn();
        assertEquals(true, LGAirConditioner.getStatus());

        assertEquals(16, LGAirConditioner.getTemperature());
        LGAirConditioner.increaseTemp(16);
        assertEquals(30, LGAirConditioner.getTemperature());
    }

    @Test
    public void testThatACCanBeDecrease(){
        AirConditioner LGAirConditioner = new AirConditioner();
        assertEquals(false, LGAirConditioner.getStatus());
        LGAirConditioner.setOn();

        assertEquals(true, LGAirConditioner.getStatus());
        assertEquals(16, LGAirConditioner.getTemperature());
        LGAirConditioner.increaseTemp(16);
        assertEquals(30, LGAirConditioner.getTemperature());

        LGAirConditioner.decreaseTemp(30);
        assertEquals(16, LGAirConditioner.getTemperature());
    }

    @Test
    public void testThatWhenITryIncreaseTheTemperatureBeyondThirtyTemperatureIsStillThirty(){
        AirConditioner LGAirConditioner = new AirConditioner();
        assertEquals(false, LGAirConditioner.getStatus());
        LGAirConditioner.setOn();
        assertEquals(true, LGAirConditioner.getStatus());

        assertEquals(16, LGAirConditioner.getTemperature());
        LGAirConditioner.increaseTemp(30);
        assertEquals(30, LGAirConditioner.getTemperature());
    }

    @Test
    public void testThatWhenITryDecreaseTheTemperatureBeyondSixtyTemperatureIsStillSixty(){
        AirConditioner LGAirConditioner = new AirConditioner();
        assertEquals(false, LGAirConditioner.getStatus());
        LGAirConditioner.setOn();
        assertEquals(true, LGAirConditioner.getStatus());

        assertEquals(16, LGAirConditioner.getTemperature());
        LGAirConditioner.decreaseTemp(16);
        assertEquals(16, LGAirConditioner.getTemperature());
    }

}
