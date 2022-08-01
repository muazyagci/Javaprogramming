package day37_Inheritance.PhoneTask;

public class Iphone extends Phone{

    public Iphone(String model, String size, String colour, double price) {
        super("Apple", model, size, colour, price);
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand+" "+model+" is having a Face Time with "+phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(brand+" "+model+" is having a Face Time with "+email);
    }



}
