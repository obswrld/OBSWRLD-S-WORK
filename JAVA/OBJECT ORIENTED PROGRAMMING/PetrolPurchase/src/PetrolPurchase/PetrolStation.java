package PetrolPurchase;

public class PetrolStation {
    private String stationName;
    private String petrolType;
    private int petrolQuantity;
    private double price;
    private double finalPrice;
    private double discount;

    public PetrolStation(String name, String type, int quantity, double price, double discount) {
        stationName = name;
        petrolType = type;
        this.petrolQuantity = 0;
        this.price = price;
        this.discount = discount;
    }

    public int getQuantity() {
        return petrolQuantity;
    }

    public void setFuel(int amount) {
        if(amount > 0) this.petrolQuantity += amount;
    }

    public void setDiscount(double price, double discount) {
            this.discount *= price;
    }

    public void setFinalPrice(double price,  int amount) {
        if(amount > 0) this.finalPrice = price * amount;
    }

    public void setPrice(double price, double discount) {
            this.price -= discount;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public double getPrice() {
        return price;
    }
}
