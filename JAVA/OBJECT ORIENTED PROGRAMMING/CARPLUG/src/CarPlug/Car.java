package CarPlug;

public class Car {
    private String name;
    private double price;
    private String year;

    public Car(String model, double worth) {
        name = model;
        if(worth > 0) price += worth;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
