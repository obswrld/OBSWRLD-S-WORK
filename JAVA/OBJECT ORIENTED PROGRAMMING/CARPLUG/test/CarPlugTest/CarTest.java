package CarPlugTest;

import CarPlug.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void testThatCarHasNameAndPrice(){
        Car obswrldCar = new Car("Benz", 25_000_000.00,"2016");
        assertTrue(true, obswrldCar.getName());
        assertEquals(25_000_000.00, obswrldCar.getPrice());
    }

    @Test
    public void testThatCarHasValidYear(){
        Car obswrldCar = new Car("Benz", 25_000_000.00,"2016");
        assertTrue(true, obswrldCar.getName());
        assertEquals(25_000_000.00, obswrldCar.getPrice());
        assertTrue(true, obswrldCar.getYear());
    }

    @Test
    public void testThatCarCannotSetValueForNegativePrice(){
        Car obswrldCar = new Car("Benz", -25_000_000.00,"2016");
        assertTrue(true, obswrldCar.getName());
        assertEquals(0, obswrldCar.getPrice());
    }

    @Test
    public void testThatCarCannotSetValueForZeroPrice(){
        Car obswrldCar = new Car("Benz", 0,"2016");
        assertTrue(true, obswrldCar.getName());
        assertEquals(0, obswrldCar.getPrice());
    }

    @Test
    public void testThatPriceOfCarCanBeCalculatedWithDiscount(){
        Car obswrldCar = new Car("Benz", 25_000_000.00,"2016");
        Car obswrldCar2 = new Car("Bmw", 20_000_000.00,"2016");
        obswrldCar.setDiscount(0.05, 25_000_000.00);
        assertEquals(1_250_000, obswrldCar.getDiscount());
        obswrldCar2.setDiscount(0.07, 20_000_000.00);
        assertEquals(1_400_000.0000000002, obswrldCar2.getDiscount());
    }

    @Test
    public void testThatPriceOfCarCanBeCalculatedWithDiscountPrice(){
        Car obswlrdCar = new Car("Benz", 25_000_000.00,"2016");
        obswlrdCar.setDiscount(0.05, 25_000_000.00);
        assertEquals(1_250_000, obswlrdCar.getDiscount());
        obswlrdCar.setDiscountPrice(25_000_000, 1_250_000);
        assertEquals(23_750_000, obswlrdCar.getDiscountPrice());
    }

    @Test
    public void testThatPriceOfCarCannotCalculateDiscountForZeroValue(){
        Car obswrldCar = new Car("Benz", 0.00,"2016");
        assertTrue(true, obswrldCar.getName());
        assertEquals(0, obswrldCar.getPrice());
        obswrldCar.setDiscount(0.05, 0.00);
        obswrldCar.setDiscountPrice(0, 0);
        assertEquals(0, obswrldCar.getDiscountPrice());
    }

    @Test
    public void testThatPriceOfCarCannotCalculateDiscountForNegativeValue(){
        Car obswlrdCar = new Car("Benz", -25_000_000.00,"2016");
        assertTrue(true, obswlrdCar.getName());
        assertEquals(0, obswlrdCar.getPrice());
        obswlrdCar.setDiscount(0.05, -25_000_000.00);
        obswlrdCar.setDiscountPrice(0, 0);
        assertEquals(0, obswlrdCar.getDiscountPrice());
    }
}
