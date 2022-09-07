package day38_Inheritance.CarTask;

public class BMW extends Car{
    public BMW(String model,int year , double price, String colour, double miles) {
        super("BMW", model, colour, year, price, miles);
    }
    public void breaksDown(){
        System.out.println(brand+" "+model+" breaks down");
    }
    public void racing(){
        System.out.println(brand+" "+model+" is racing");
    }

    @Override
    public void start() {

        System.out.println("har har har har");
    }

    @Override
    public void drive() {

        System.out.println("Call someone for jump start");
    }
}
