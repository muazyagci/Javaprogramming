package Replit;

import java.util.Scanner;

public class HasAJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        if (word.length() > 5) {
            String contains = word.substring(0, 6);


            exists = contains.contains("java");

        } else {
            exists = false;
        }
        System.out.println(exists);
scan.close();
    }
}
