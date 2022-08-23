package day43_OOP_Abstarction.Car.Car;

public class CarShop {
    public static void main(String[] args) {
       // Car car= new Car("Cydeo","B25","Blue",100000,2019); we can not create object class, because abstract class id not concrete

        Honda honda=new Honda("Honda","Accord","Black",30000,2019);
        Audi audi=new Audi("Audi","Q7","White",45000,2020);
        Tesla tesla=new Tesla("Tesla","Model3","Grey",60000,2021);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);


    }
}
