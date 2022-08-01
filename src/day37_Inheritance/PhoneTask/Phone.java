package day37_Inheritance.PhoneTask;

public class Phone {
    public String brand,model,size,colour;

    public double price;

    public static boolean hasBattery=true;

    public Phone(String brand, String model, String size, String colour, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.colour = colour;
        this.price = price;
    }

    public void call(long phoneNumber){
        System.out.println(brand+" "+model+" is calling "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand+" "+model+" is texting "+phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                ", price= €" + price +
                '}';
    }



}
