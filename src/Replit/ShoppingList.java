package Replit;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        for (int i = 0; i < count;) {
            System.out.println("Enter Item"+count+" and its price:");

          item+=" "+scan.next();
        price= scan.nextDouble();
        totalPrice+=price;
            System.out.println("Add one more item?");
            countinue+= scan.next();
           if (countinue.equalsIgnoreCase("yes")){
               count+=1;
           } else if (countinue.equalsIgnoreCase("no")) {
             i+=9999999;
           }

        }
        System.out.println();


        System.out.println("Total price "+totalPrice);
        
    }
}
