package day16_ForLoopStringPractice;

import java.util.Scanner;

public class without {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two numbers");
    int num1= scan.nextInt();
    int num2= scan.nextInt();
    int result=0;
        for (int i = 0; i <num2 ; i++) {
            result+=num1;

        }
        System.out.println("result = " + result);
scan.close();
    }
}
