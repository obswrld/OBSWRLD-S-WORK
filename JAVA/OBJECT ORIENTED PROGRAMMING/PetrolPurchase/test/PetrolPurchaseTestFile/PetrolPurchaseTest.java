package PetrolPurchaseTestFile;

import PetrolPurchase.PetrolStation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PetrolPurchaseTest {

    @Test
    public void testThatPetrolStationTakesIntegerQuantity(){
        PetrolStation total = new PetrolStation("Total Feeling Station","Fuel", 10, 945.02,4.50);
        assertEquals(0, total.getQuantity());
        total.setFuel(10);
        assertEquals(10, total.getQuantity());
    }

    @Test
    public void testThatPetrolStationDoesNotTakeNegativeIntegerQuantity(){
        PetrolStation total = new PetrolStation("Total Feeling Station","Fuel", 10, 945.02,4.5);
        assertEquals(0, total.getQuantity());
        total.setFuel(-10);
        assertEquals(0, total.getQuantity());
    }

    @Test
    public void testThatPetrolStationDoesNotTakeZeroIntegerQuantity(){
        PetrolStation total = new PetrolStation("Total Feeling Station","Fuel", 10, 945.02,4.5);
        assertEquals(0, total.getQuantity());
        total.setFuel(0);
        assertEquals(0, total.getQuantity());
    }

    @Test
    public void testThatPetrolStationCalculatesThePriceOfFuelRequested(){
        PetrolStation total = new PetrolStation("Total Feeling Station","Fuel", 10, 550.50,4.5);
        assertEquals(0, total.getQuantity());
        total.setFuel(10);
        assertEquals(10, total.getQuantity());

        total.setPrice(10,550.50);
        assertEquals(5_505.00, total.getPrice());

    }
}
