package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner nl=new Scanner(System.in);

        System.out.println("Enter agae");
int age=nl.nextInt();



nl.nextLine();// gets all in the scanner

        System.out.println("Enter your gpa");
        Double gp=nl.nextDouble();
        nl.nextLine();
        System.out.println("Enter your full name");
    String name=nl.nextLine();


        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("gp = " + gp);
nl.close();





    }
}
/*
Ask user to enter age
ask user to enter full name
 */