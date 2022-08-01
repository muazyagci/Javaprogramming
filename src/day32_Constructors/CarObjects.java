package day32_Constructors;

public class CarObjects {
    public static void main(String[] args) {
        Car car1=new Car("Toyota");
        Car car2=new Car("Tesla","ModelS");
        Car car3=new Car("Kia","EV6","Red");
        Car car4=new Car("Hyundai","Ioniq5","Cream");
        Car car5=new Car("Hyundai","Ioniq6","White",50000);
        Car car6=new Car("Mercedes","EQS","White",70000,2023);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        System.out.println(car6);


    }
}
