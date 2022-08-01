package Replit;

import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        System.out.print(word1+word2+word2+word1);


    scan.close();
    }
}
