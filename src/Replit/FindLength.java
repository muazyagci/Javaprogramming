package Replit;

import java.util.Scanner;

public class FindLength {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the text:");
        String text=scan.nextLine();
        System.out.println("Length is: "+text.length());
scan.close();
    }
}
