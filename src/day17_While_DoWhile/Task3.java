package day17_While_DoWhile;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1= scan.nextInt();
        System.out.println("Enter second number");
int num2= scan.nextInt();
        System.out.println("Enter valid operator");

char op=scan.next().charAt(0);

while (!(op=='+'||op=='-'||op=='*'||op=='/')){
    System.out.println("Please enter a valid Operator");
op=scan.next().charAt(0);


}
        if (op=='+'){
            System.out.println(num1+num2);
        } else if (op=='-') {
            System.out.println(num1-num2);
        } else if (op=='/') {
            System.out.println(num1/num2);
        } else if (op=='*') {
            System.out.println(num1*num2);
        }
scan.close();

    }
}
