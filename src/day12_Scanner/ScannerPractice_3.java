package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your full name");
        String name=sc.nextLine();

        System.out.println("Enter your Programming language");
        String Programming= sc.nextLine();

        System.out.println("Enter your age");
        int age=sc.nextInt();
       sc.nextLine();

        System.out.println("enter your School name");
        String schoolName= sc.nextLine();

        System.out.println("name = " + name);
        System.out.println("Programming = " + Programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);
sc.close();









    }
}
