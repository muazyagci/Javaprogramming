package Replit;

import java.util.Objects;
import java.util.Scanner;

public class FindAUser {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String user1 = "Max Payne";
        String user2 = "Alan Wake";
        System.out.println("Enter full name:");
        String input = scan.nextLine();

        boolean su1=input.equalsIgnoreCase(user1);
        boolean us2=input.equalsIgnoreCase(user2);
        if (su1||us2){
            System.out.println("User found!");
        }else System.out.println("User not found!");

        scan.close();
    }
}
