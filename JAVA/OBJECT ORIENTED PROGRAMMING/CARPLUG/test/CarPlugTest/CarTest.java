package CarPlugTest;

import CarPlug.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void testThatCarHasNameAndPrice(){
        Car obswrldCar = new Car("Benz", 25_000_000.00);
        assertTrue(true, obswrldCar.getName());
        assertEquals(25_000_000.00, obswrldCar.getPrice());
    }

    @Test
    public void testThatCarCannotSetValueForNegativePrice(){
        Car obswrldCar = new Car("Benz", -25_000_000.00);
        assertTrue(true, obswrldCar.getName());
        assertEquals(0, obswrldCar.getPrice());
    }

    @Test
    public void testThatCarCannotSetValueForZeroPrice(){
        Car obswrldCar = new Car("Benz", 0);
        assertTrue(true, obswrldCar.getName());
        assertEquals(0, obswrldCar.getPrice());
    }
}
