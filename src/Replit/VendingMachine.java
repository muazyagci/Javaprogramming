package Replit;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cents = scan.nextInt(), pennies = 0, nickles
                = 0, quarters = 0, dimes = 0;


        if (cents > 0 && cents < 100) {
            quarters = cents / 25;
            cents = cents % 25;
            dimes = cents / 10;
            cents = cents % 10;
            nickles = cents / 5;
            cents = cents % 5;
            pennies = cents / 1;
            cents = cents % 1;

        } else System.out.println("Invalid cents amount");
        System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickles + " nickels, and " + pennies + " pennies");
scan.close();

    }
}
