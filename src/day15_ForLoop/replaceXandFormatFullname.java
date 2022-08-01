package day15_ForLoop;

import java.util.Scanner;

public class replaceXandFormatFullname {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
    String word= scan.next();

    if (word.substring(0,1).equalsIgnoreCase("x") ){

        word=word.replaceAll("x","a");
        word=word.replaceAll("X","A");
    }
        System.out.println("word = " + word);




        System.out.println("Enter first name");
        String firstname = scan.next();
        System.out.println("and last name");
        String lastname = scan.next();

        firstname=firstname.substring(0,1).toUpperCase()+firstname.substring(1).toLowerCase();
        lastname=lastname.substring(0,1).toUpperCase()+lastname.substring(1).toLowerCase();
        System.out.println(firstname+" "+lastname);
        scan.close();









    }
}
