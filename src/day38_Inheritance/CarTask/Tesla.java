package day38_Inheritance.CarTask;

public class Tesla extends Car{
    public Tesla(String model,int year , double price, String colour, double miles) {
        super("Tesla", model, colour, year, price, miles);
    }

    public void autoPilot(){
        System.out.println(brand+" "+model+" in auto pilot mode");
    }
@Override
public void start(){
    System.out.println("Say start "+brand+" "+model);
}



}
