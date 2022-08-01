package Replit;

import java.util.Scanner;

public class tipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfPeople0 = 0;
        System.out.println("Split");
        String SplitOrNot = scan.next();
        if (SplitOrNot.equalsIgnoreCase("Yes")) {
            System.out.println("Number of people");
            numOfPeople0 += scan.nextInt();

        } else if (SplitOrNot.equalsIgnoreCase("No")) {
            numOfPeople0 += 1;
        }
        System.out.println("Total to pay");
        double totaltopay = scan.nextInt();
        System.out.println("Quality");
        String quality = scan.next();
        double totaltip = 0;
        if (quality.equalsIgnoreCase("Poor")) {
            totaltip += totaltopay * 0.05;
        } else if (quality.equalsIgnoreCase("Good")) {
            totaltip += totaltopay * 0.15;
        } else if (quality.equalsIgnoreCase("Great")) {
            totaltip += totaltopay * 0.20;
        } else if (quality.equalsIgnoreCase("Excellent")) {
            totaltip += totaltopay * 0.25;
        }
        System.out.println("Number of people entered: " + numOfPeople0);
        System.out.println("Total to pay: " + (totaltopay + totaltip));
        System.out.println("Total tip: " + totaltip);
        System.out.println("Total per person: " + (totaltopay + totaltip) / numOfPeople0);
        System.out.println("Tip per person: " + (totaltip / numOfPeople0));
scan.close();
    }
}
