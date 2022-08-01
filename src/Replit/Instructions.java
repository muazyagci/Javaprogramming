package Replit;

import java.util.Scanner;

public class Instructions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();

        int fi=sentence.indexOf(word);
        System.out.println("fi = " + fi);
        scan.close();
    }
}
