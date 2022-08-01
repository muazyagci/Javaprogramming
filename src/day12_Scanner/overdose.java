package day12_Scanner;

import java.util.Scanner;

public class overdose {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" Enter number of milligrams in drink:");
        int lethalDose=10000;
        int perDrink=scan.nextInt();
        int drinks=lethalDose/perDrink;
        System.out.println("It would take about " + drinks+" drinks for a lethal overdose..");
scan.close();
    }
}
