package day36_Inheritance.PhoneTasks;

public class Phone {
    public String brand,model,size,colour;
    public double price;

    public void setInfo(String brand, String model, String size, String colour, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.colour = colour;
        this.price = price;
    }

    public void call(long phoneNumber){

    }
    public void text(long phoneNumber){

    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
