package day11_Switch_Scanner;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
// next line dan once baska herhangi bir next kullanirsak compiler next line i gormez
        // next line nin okunmasi icin kullanilmasi gereken next line dan once baska bir bos next line koyulmasi lazim.
//        int kol= scan.nextInt();
//
//
//
//       String ilk= scan.nextLine();
//
//        System.out.println(ilk);
//
//


        System.out.println("Enter a Coffee Size");
        String size= scan.next();

        switch (size){
            case "tall":
                System.out.println("Price is €3.69");
                System.out.println("90 Calories");
                break;
            case "grande":
                System.out.println("Price is €3.99");
                System.out.println("120 Calories");
            break;
            case "venti":
                System.out.println("Price is €4.29");
                System.out.println("150 Calories");
                break;
            default:
                System.err.println("Invailid Size ");

        }

/*
Tasks:
1. Create a class called  CappuccinoBuyer. A variable named Size is
given, write a program that can display the price and calories of
cappuccino
Valid sizes are tall, grande, venti and their
price & calories are:
tall:
price is $3.69
90 calories
grande:
price is $3.99;
120 calories
venti:
price is $4.29
150 calories
If the size is invalid then the output should
be "Invalid Size"
 */
    }
}
