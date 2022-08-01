package day38_Inheritance.CarTask;

public class Tesla extends Car{
    public Tesla(String brand, String model, String colour, int year, double price, double miles) {
        super(brand, model, colour, year, price, miles);
    }
    public void autoPilot(){
        System.out.println(brand+" "+model+" has auto pilot that means it drives itself");
    }

}
