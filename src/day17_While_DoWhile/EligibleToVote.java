package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sca.nextInt();
        while (!(age >= 1 && age <= 120)) {
            System.err.println("Invalid entry, please re-enter");
            System.err.println("Enter your age: ");
            age = sca.nextInt();

        }
        System.out.println("Are you a US citizen? yes/no");
    String answer= sca.next();
    while (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
        System.err.println("Invalid entry, please enter again");
        System.err.println("Are you a US citizen? yes/no");
    answer= sca.next();
    }
sca.close();
    }
}
