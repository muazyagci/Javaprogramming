package day17_While_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class MarriegeProposal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Will you marry me? yes/no");
    String a= scan.next().toLowerCase();

    while (!(a.equals("yes")||a.equals("no"))){
        System.out.println("Invalid answer please re enter");
   a=a= scan.next().toLowerCase();
    }
    if (a.equals("yes")){
        System.out.println("Congrats");
    }else {
        System.out.println("Goodbye");
    }
    scan.close();
    }
}
