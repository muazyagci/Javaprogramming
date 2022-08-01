package day15_ForLoop;

import java.util.Scanner;

public class task1_3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sumOfEven=0;
        int sumOfOdd=0;
        for (int i = 1; i <=100 ; i++) {
            if (i%2==0){
                sumOfEven+=i;
            }else {
                sumOfOdd+=i;
            }
        }
        System.out.println();
        System.out.println("sumOfEven = " + sumOfEven);
        System.out.println("sumOfOdd = " + sumOfOdd);

        System.out.println("-----------------");

        System.out.println("Enter any number: ");
int anyGivenNumber= scan.nextInt();
int sumOfAll=0;
        for (int i = 0; i <=anyGivenNumber ; i++) {
            sumOfAll+=i;
        }
        System.out.println();

        System.out.println("sumOfAll = " + sumOfAll);


        /*
        1. Write a program that can return the sum of even numbers between 1 to 100

	2. Write a program that can return the sum of odd numbers between 1 to 100

	3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
         */
    }
}
