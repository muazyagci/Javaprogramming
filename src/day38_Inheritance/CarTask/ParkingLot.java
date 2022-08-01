package day38_Inheritance.CarTask;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota=new Toyota("Camry","Green",2020,20000,15400);
        System.out.println(toyota);

        Tesla tesla=new Tesla("ModelS","White",2022,57000,65000);
        System.out.println(tesla);

        BMW bmw=new BMW("116","White",2019,19000,26000);
        System.out.println(bmw);



    }

}
