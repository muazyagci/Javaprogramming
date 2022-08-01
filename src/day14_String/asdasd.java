package day14_String;

import java.util.Scanner;

public class asdasd {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        String str1=new String(scan.nextLine());
        System.out.println(str1.length());
        System.out.println(str1.charAt(str1.length()-1));
        System.out.println(str1.charAt(1));
str1=str1.toLowerCase();
        System.out.println("str1 = " + str1);


scan.close();
    }
}
