package Replit;

import java.util.Scanner;

public class MiddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.length() > 1 && (word.length()) % 2 != 0) {
            System.out.println(word.charAt(word.length() / 2));
        }

        if (word.length() == 1) {
            System.out.println(word.repeat(3));
        }

        if (word.length()>=4&&word.length()%2==0){
            System.out.println(word.substring(word.length()/2-1 , word.length()/2+1));

        }
        if (word.length()==2){
            System.out.println(word.repeat(2));
        }

scan.close();
    }
}
