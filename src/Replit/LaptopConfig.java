package Replit;

import java.util.Scanner;

public class LaptopConfig {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double price = 0;

        System.out.println("Select screen size:");
        Double screensize = scan.nextDouble();
        if (screensize.equals(13.3)) {
            price += 200;
        } else if (screensize.equals("15")) {
            price += 300;
        } else if (screensize.equals(17.3)) {
            price += 400;
        }
        System.out.println("Select CPU type:");
        String cputype = scan.next();
        if (cputype.equalsIgnoreCase("i3")) {
            price += 150;
        } else if (cputype.equalsIgnoreCase("i5")) {
            price += 250;
        } else if (cputype.equalsIgnoreCase("i7")) {
            price += 350;
        }

        System.out.println("Select RAM size:");
        int ramSize = scan.nextInt();
        price += (ramSize / 4) * 50;
        scan.nextLine();

        System.out.println("Select Storage type:");
        String storagetype = scan.next();

        System.out.println(" Select memory size:");
        int memorysize = scan.nextInt();
        if (storagetype.equalsIgnoreCase("SSD")) {
            price += (memorysize / 500) * 100;
        } else if (storagetype.equalsIgnoreCase("HDD")) {
            price += (memorysize / 500) * 50;
        }
        scan.nextLine();
        System.out.println("Enter screen resolution:");
        String screenres = scan.next();
        if (screenres.equalsIgnoreCase("FULLHD")){

            price+=100;
        } else if (screensize.equals("4K")) {
            price+=200;
        }
        System.out.println("Laptop price is: $"+price);
        scan.close();

/*
     First ask user for a screen size.
//        - If screen size is equals to 13.3, add  $200 to the laptop price.
//        - If screen size is equals to  15.0 - add  $300 to the laptop price.
//        - If screen size is equals to  17.3 - add  $400 to the laptop price.
//
//        Then ask user for CPU type.
//        - If CPU type equals to i3, add  $150 to the laptop price.
//        - If CPU type equals to i5, add  $250 to the laptop price.
//        - If CPU type equals to i7, add  $350 to the laptop price.
//
//        Then ask user for RAM size.
//        - Add  $50 for every 4GB of ram to the laptop price.
//
//        Then, ask user for storage type. There are 2 options: SSD and HDD.
//        - If it's HDD - add $50 to the laptop price for every 500gb.
//        - If it's SSD - add $100 to the laptop price for every 500GB.
//
//        Then ask user for for screen resolution. There are 2 options: FULLHD and 4K.
//        - Add $100 if it's FULLHD screen
//        - Add $200 if it's 4K screen.
     */
    }
}
