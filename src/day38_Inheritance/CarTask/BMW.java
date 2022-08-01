package day38_Inheritance.CarTask;

public class BMW extends Car{
    public BMW(String model, String colour, int year, double price, double miles) {
        super("BMW", model, colour, year, price, miles);
    }
    public void breaksDown(){
        System.out.println(brand+" "+model+" breaks down");
    }
    public void racing(){
        System.out.println(brand+" "+model+" is racing");
    }

}
