package Replit;

import java.util.Scanner;

public class PrintLastCharachetr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(word.charAt(word.length()-1));





        scan.close();
    }
}
