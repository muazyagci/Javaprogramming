package day43_OOP_Abstarction.Car.Car;

public class Honda extends Car {

    public Honda(String make, String model, String colour, double price, int year) {
        super(make, model, colour, price, year);
    }


    @Override
    public void start() {
        System.out.println("Twist the key to ignition.");
    }

    @Override
    public void stop() {
        System.out.println("");
    }

}
