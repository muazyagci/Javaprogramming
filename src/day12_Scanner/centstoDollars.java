package day12_Scanner;

import java.util.Scanner;

public class centstoDollars {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter cents");
        int inputcents= scan.nextInt();
        int dollar=inputcents/100;
        inputcents=inputcents%100;
int cents=inputcents;
        System.out.println(inputcents+" cents equal to: "+dollar+" dollars and "+cents+" cents");


    }
}
