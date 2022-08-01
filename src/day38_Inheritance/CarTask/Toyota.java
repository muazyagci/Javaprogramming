package day38_Inheritance.CarTask;

import day37_Inheritance.Animal.Cat;

public class Toyota extends Car {
    public Toyota(String brand, String model, String colour, int year, double price, double miles) {
        super(brand, model, colour, year, price, miles);
    }
    public void reliable(){
        System.out.println(model+" "+brand+" is reliable.");
    }

}
