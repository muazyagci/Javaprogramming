package day43_OOP_Abstarction.Car;

public final class Audi extends Car{
    public Audi(String model, String colour, double price, int year) {
        super("Audi", model, colour, price, year);
    }



    public void start() {
        System.out.println("Push the start button");
    }
    public void autoPark(){
        System.out.println(getModel()+" "+getMake()+" has auto park feature");
    }

}
