package Replit;

import java.util.Scanner;

public class class1 {
    public static void main(String[] args) {
//        boolean yunusIsgay=true;
//        while (yunusIsgay){
//            System.out.println("YUNUS IS NIQQA AND GAY");
//        }
        Scanner scan = new Scanner(System.in);

        double balance = 100;


        String order1 = scan.next();

        switch (order1) {
            case "Blanket":
                balance -= 60;
                System.out.println("Thank you for your purchase!");
                break;
            case "Charger":
                balance -= 25;
                System.out.println("Thank you for your purchase!");
                break;
            case "Hat":
                balance -= 25;
                System.out.println("Thank you for your purchase!");
                break;
            case "Headphones":
                balance -= 30;
                System.out.println("Thank you for your purchase!");
            case "laptop":
                balance -= 200;
                System.out.println("Thank you for your purchase!");
                break;
            case "Pants":
                balance -= 50;
                System.out.println("Thank you for your purchase!");
                break;
            case "Pillow":
                balance -= 40;
                System.out.println("Thank you for your purchase!");
                break;
            case "Smartphone":
                balance -= 1000;
                System.out.println("Thank you for your purchase!");
                break;
            case "Socks":
                balance -= 5;
                System.out.println("Thank you for your purchase!");
                break;
            case "USb cable":
                balance-=10;
                System.out.println("Thank you for your purchase!");
                    default:
                System.err.println("invalid item!");

        }

        System.out.println("Your current balance is: "+balance + "€");


    }
}
