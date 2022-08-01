package day12_Scanner;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Item1 and its price:");
    String item1= scan.next();
    Double Item1Price= scan.nextDouble();
        System.out.println("Enter Item2 and its price:");
        String item2= scan.next();
        Double Item2Price= scan.nextDouble();
        System.out.println("Enter Item3 and its price:");
        String item3= scan.next();
        Double Item3Price= scan.nextDouble();
double TotalPrice=Item1Price+Item2Price+Item3Price;
        System.out.println("Item1: "+item1+" Price: "+Item1Price+", "+"Item2: "+item2+" Price: "+Item2Price+", "+"Item3: "+item3+" Price: "+Item3Price+", "
        +"Total price: "+TotalPrice);
        scan.close();
    }
}
