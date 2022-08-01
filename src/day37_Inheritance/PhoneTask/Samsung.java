package day37_Inheritance.PhoneTask;

public class Samsung extends Phone{
    public Samsung(String model, String size, String colour, double price) {
        super("Samsung", model, size, colour, price);
    }
    public void freeze(){
        System.out.println(brand+" "+model+" is freezing");
    }

}
