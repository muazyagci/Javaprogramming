package Replit;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int o=1;
        String names="";
        for (int i = 1; i <=o ;) {
            System.out.println("Please enter guest name:");
            names+=(input.next());
            System.out.println("Do you want to enter new guest name:");
            String isNew=input.next();
            if (isNew.equalsIgnoreCase("yes")){
                i--;
                names=names+", ";
            } else if (isNew.equalsIgnoreCase("no")) {
                i+=3;
                System.out.println("Guest's list: "+names);
            }

        }










    }
}
