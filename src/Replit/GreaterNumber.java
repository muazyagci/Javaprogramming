package Replit;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if (a > b) {
            System.out.println(a + "number is greater");
        } else
            System.out.println(b + "number is greater");

s.close();
    }
}
