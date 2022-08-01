package Replit;

import java.util.Scanner;

public class mail1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if (email.contains("_")){
          int underscore=email.indexOf("_");
            String name=email.substring(0,underscore);
            int endfmail=email.lastIndexOf("@");
            String lastname=email.substring(underscore+1,endfmail);
           String domain=email.substring(endfmail);
            System.out.println(lastname+"_"+name+domain);


        }else System.out.println(email);
        scan.close();

    }
}
