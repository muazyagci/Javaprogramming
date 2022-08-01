package day38_Inheritance.CarTask;

public class Tesla extends Car{
    public Tesla(String model, String colour, int year, double price, double miles) {
        super("Tesla", model, colour, year, price, miles);
    }
    public void autoPilot(){
        System.out.println(brand+" "+model+" has auto pilot that means it drives itself");
    }

}
