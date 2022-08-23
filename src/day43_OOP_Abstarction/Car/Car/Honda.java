package day43_OOP_Abstarction.Car.Car;

public final class Honda extends Car {

    public Honda(String make, String model, String colour, double price, int year) {
        super(make, model, colour, price, year);
    }


    @Override
    public void start() {
        System.out.println("Say\" start\"");
    }


    public void autoPilot(){
        System.out.println(getMake()+" "+getModel()+" has auto pilot feature");
    }




}
