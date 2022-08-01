package Day13_StringClass;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter your name");
        String firstname=new String(scan.next());
        System.out.println("Enter your last name");
        String lastname=new String(scan.next());
        char f=firstname.charAt(0);
        char l=lastname.charAt(0);
      String initial=""+f+"."+l;
        System.out.println("initial = "+initial);
scan.close();
    }
}
