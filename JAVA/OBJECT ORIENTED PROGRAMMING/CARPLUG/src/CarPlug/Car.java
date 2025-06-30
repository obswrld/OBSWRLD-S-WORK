package CarPlug;

public class Car {
    private String name;
    private double price;
    private String year;
    private double finalPrice;

    public Car(String model, double worth, String year) {
        name = model;
        if(worth > 0) price += worth;
        this.year = year;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getYear() {
        return year;
    }

    public void setDiscount(double discount, double worth) {
        if(worth > 0) price = worth * discount;
    }

    public double getDiscount() {
        return price;
    }

    public void setDiscountPrice(double worth, double discount) {
        if(worth > 0) finalPrice = worth - discount;
    }

    public double getDiscountPrice() {
        return finalPrice;
    }
}
