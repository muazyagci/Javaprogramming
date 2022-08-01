package Replit;

import java.util.Scanner;

public class Citizen {
    public static void main(String[] args) {
        int seniorCitizen, nonSeniorCitizen, age;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and non SeniorCitizens:");
        seniorCitizen = scan.nextInt();
        nonSeniorCitizen = scan.nextInt();
        System.out.println("What is new citizen's age?");
        age = scan.nextInt();

        if (age >= 65) {
            System.out.println("Senior Citizen");
            seniorCitizen++;
        }
        if (age < 65) {
            System.out.println("Non-Senior Citizen");
            nonSeniorCitizen++;
        }

        System.out.println("New seniorCitizens count " + seniorCitizen);
        System.out.println("New nonSeniorCitizens count " + nonSeniorCitizen);

scan.close();
    }
}
