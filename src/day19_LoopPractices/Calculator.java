package day19_LoopPractices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1= scan.nextInt();
        System.out.println("Enter a math operator:");
    char op=scan.next().charAt(0);
   /* while (!(op=='+'||op=='-')){
        System.out.println("Please enter a valid operator");
        op=scan.next().charAt(0);
    }

    */
        if (!(op=='+'||op=='-')){// if the operator is not valid
            System.err.println("Invlaid operator");
        System.exit(0);// it terminates the whole program

        }


        System.out.println("Enter a number: ");
        int num2= scan.nextInt();


       if (op=='+'){
           System.out.println(num1+num2);

       }

    }
}
