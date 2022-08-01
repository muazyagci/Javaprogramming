package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
while (true) {
    System.out.println("Enter a number");
    int num = scan.nextInt();

    if (num % 2 == 0) {
        System.out.println(num + " is even");
    } else {
        System.out.println(num + " is odd number");
    }

    System.out.println("Would you like to enter another number");
    String a = scan.next().toLowerCase();
    while (!(a.equalsIgnoreCase("yes")||a.equalsIgnoreCase("no"))){
        System.err.println("Please enter a valid answer");
    a= scan.next().toLowerCase();

    }

    if (a.equalsIgnoreCase("no")){
        break;
    }
}
scan.close();



    }
}
