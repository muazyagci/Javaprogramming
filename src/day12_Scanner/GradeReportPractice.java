package day12_Scanner;

import java.util.Scanner;

public class GradeReportPractice {
    public static void main(String[] args) {
        Scanner gr=new Scanner(System.in);
       // System.out.println("Enter true or false");

        //boolean result=gr.nextBoolean();
        System.out.println("Enter your full name");
    String name=gr.next();
        System.out.println("name = " + name);
        gr.close();



    }
}
