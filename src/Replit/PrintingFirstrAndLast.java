package Replit;

import java.util.Scanner;

public class PrintingFirstrAndLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        System.out.print(word.charAt(word.indexOf("")));

        System.out.println(word.charAt(word.length()-1));



        scan.close();
    }
}
