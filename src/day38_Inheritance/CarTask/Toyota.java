package day38_Inheritance.CarTask;

import day37_Inheritance.Animal.Cat;

public class Toyota extends Car {
    public Toyota(String model,int year , double price, String colour, double miles) {
        super("Toyota", model, colour, year, price, miles);
    }
    public void reliable(){
        System.out.println(model+" "+brand+" is reliable.");
    }

    public void start(){
        System.out.println("Twist the key to ignition "+brand+" "+model);
    }



}
