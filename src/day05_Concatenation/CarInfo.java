package day05_Concatenation;

import java.util.Scanner;

public class CarInfo {
    public static void main(String[] args) {
        String year="2018",make="Toyota",model="Camry",miles="50000",color="Red",price="19000$";
       // System.out.println(year+" "+make+" "+model+" "+miles+" "+color+" "+price);
        String carinfo=year+" "+make+" "+model+" "+miles+" "+color+" "+price;
        System.out.println(carinfo);


        System.out.println("----------------------------");

        Scanner sc = new Scanner(System.in);

        String isim;
        int age;
        System.out.println("What is your name?");

        isim=sc.nextLine();


        System.out.println("Thanks you MR "+isim);
        System.out.println("How old are you?");
        age=sc.nextInt();
        System.out.println("You are "+age+" years old.");

    }



}
