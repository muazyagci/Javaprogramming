package day32_Constructors;

public class Car {

    public String make, model, colour;
    public double price;
    public int year;

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, String model) {
        this(make);
        this.model = model;
    }

    public Car(String make, String model, String colour) {
        this(make, model);
        this.colour = colour;
    }

    public Car(String make, String model, String colour, double price) {
        this(make, model, colour);
        this.price = price;
    }

    public Car(String make, String model, String colour, double price, int year) {
        this(make, model, colour, price);
        this.year = year;
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", price= €" + price +
                ", year=" + year +
                '}';
    }
}
