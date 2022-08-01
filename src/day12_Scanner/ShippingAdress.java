package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {

        Scanner sh=new Scanner(System.in);

        System.out.println("Enter your full name");
        String name=sh.nextLine();

        System.out.println("Enter your building number");
    String buildingNum= sh.next();

    sh.nextLine();

        System.out.println("Enter your Street number");
    String Streetname= sh.nextLine();

        System.out.println("Enter your city name");
String cityname= sh.nextLine();

        System.out.println("Enter your state name");
String statename= sh.next();

        System.out.println("Enter your zip code");
        String zipcode= sh.next();

        System.out.println("name = " + name);
        System.out.println("buildingNum = " + buildingNum);
        System.out.println("Streetname = " + Streetname);
        System.out.println("cityname = " + cityname);
        System.out.println("statename = " + statename);
        System.out.println("zipcode = " + zipcode);

sh.close();

    }
}
