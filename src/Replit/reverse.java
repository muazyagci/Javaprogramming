package Replit;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.length()>3) {
            for (int i = word.length() - 1; i >= 0; i--) {
                char result = word.charAt(i);

            }}else System.out.println("Too short!");
        scan.close();
    }
}
