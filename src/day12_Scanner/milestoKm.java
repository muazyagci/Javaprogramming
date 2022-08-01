package day12_Scanner;

import java.util.Scanner;

public class milestoKm {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter miles:");
double miles=scan.nextDouble();
     Double km=miles*1.61;

        System.out.println(miles+" miles equal to "+km+" kilometers");
scan.close();

    }
}
