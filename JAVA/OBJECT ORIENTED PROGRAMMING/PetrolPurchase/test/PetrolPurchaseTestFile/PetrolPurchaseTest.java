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
    public void testThatPetrolStationCanAllowUserToAddMoreQuantity(){
        PetrolStation total = new PetrolStation("Total Feeling Station","Fuel", 10, 945.02,4.50);
        assertEquals(0, total.getQuantity());
        total.setFuel(10);
        assertEquals(10, total.getQuantity());
        total.setFuel(10);
        assertEquals(20, total.getQuantity());
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
        PetrolStation total = new PetrolStation("Total Feeling Station","Fuel", 10, 550.50,0.10);
        assertEquals(0, total.getQuantity());
        total.setFuel(10);
        total.setDiscount(550.50, 0.10);
        total.setPrice(550.50, 55.05);
        total.setFinalPrice(495.45, 10);
        assertEquals(4_954.50, total.getFinalPrice());

    }

    @Test
    public void testThatPetrolStationDoesNotCalculatesForNegativeFuelAmountRequested(){
        PetrolStation total = new PetrolStation("Total Feeling Station","Fuel", 0, 550.50,0.10);
        assertEquals(0, total.getQuantity());
        total.setFuel(-10);
        total.setDiscount(550.50, 0.10);
        total.setPrice(550.50, 55.05);
        total.setFinalPrice(495.45, -10);
        assertEquals(0, total.getFinalPrice());
    }

    @Test
    public void testThatPetrolStationDoesNotCalculatesForZeroFuelAmountRequested(){
        PetrolStation total = new PetrolStation("Total Feeling Station","Fuel", 0, 550.50,0.10);
        assertEquals(0, total.getQuantity());
        total.setFuel(0);
        total.setDiscount(550.50, 0.10);
        total.setPrice(550.50, 55.05);
        total.setFinalPrice(495.45, 0);
        assertEquals(0, total.getFinalPrice());

    }

    @Test
    public void testThatPetrolStationCanAddMoreFuelRequestedForUser(){
        PetrolStation total = new PetrolStation("Total Feeling Station","Fuel", 20, 550.50,0.10);
        assertEquals(0, total.getQuantity());
        total.setFuel(10);
        assertEquals(10, total.getQuantity());
        total.setFuel(10);
        assertEquals(20, total.getQuantity());
        total.setDiscount(550.50, 4.5);
        total.setPrice(550.50, 55.05);
        total.setFinalPrice(495.45, 20);
        assertEquals(9_909, total.getFinalPrice());
    }

    @Test
    public void testThatPetrolStationCalculatesTheDiscountOfFuelPricesRequested(){
        PetrolStation total = new PetrolStation("Total Feeling Station","Fuel", 10, 550.50,0.10);
        assertEquals(0, total.getQuantity());
        total.setFuel(10);
        assertEquals(10, total.getQuantity());
        total.setDiscount(550.50, 0.10);
        assertEquals(55.050000000000004, total.getDiscount());
    }

    @Test
    public void testThatPetrolStationCanCalculateThePriceOfFuelRequested(){
        PetrolStation total = new PetrolStation("Total Feeling Station","Fuel", 10, 550.50,0.10);
        assertEquals(0, total.getQuantity());
        total.setFuel(10);
        total.setPrice(550.50, 55.05);
        assertEquals(495.45, total.getPrice());
    }
}
