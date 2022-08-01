package day37_Inheritance.PhoneTask;

public class Nokia extends Phone{
    public Nokia(String model, String size, String colour, double price) {
        super("Nokia", model, size, colour, price);
    }
    public void selfDefence(){
        System.out.println("You can use "+brand+" "+model+" as self defence tool");
    }


}
