package day43_OOP_Abstarction.Car.Car;

public abstract class Car {
    private final String make,model;
    private String colour;
    private double price;
    private final int  year;

    public Car(String make, String model, String colour, double price, int year) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.price = price;
        if (year<1886){
            throw new RuntimeException("Invalid year: "+year);
        }
        this.year = year;
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public abstract void start();


    public void stop(){
        System.out.println("Press the brake");

    }

}


