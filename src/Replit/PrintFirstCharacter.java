package Replit;

import java.util.Scanner;

public class PrintFirstCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(word.charAt(word.indexOf("")));


        scan.close();

    }
}
