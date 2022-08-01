package WithOscar.Week04;

import java.util.Scanner;

public class AdaireApartments {
    public static void main(String[] args) {

        int floorNumber; // Declaring my variable no value

        Scanner input=new Scanner(System.in);

        // ask the user for which floor the user is living

        System.out.println("Which floor are you living");

        floorNumber= input.nextInt();

        // with if else statements
        System.out.println("With If Else statement");
        if (floorNumber== 1){// Condition
            System.out.println("You are living at first floor");//Action
        } else if (floorNumber==2) {
            System.out.println("You are living in second floor");
        } else if (floorNumber == 3) {
            System.out.println("You are living in third floor");

        } else if (floorNumber==4) {
            System.out.println("You are living in fourth floor");
        }else System.out.println("There is no such floor");


        //Switch statements
        System.out.println("With Switch statement");
        switch (floorNumber){
            case 1:
                System.out.println("You are living in first floor");
        break;
            case 2:
                System.out.println("You are living in second floor");
                break;
            case 3:
                System.out.println("You are living in third floor");
                break;
            case 4:
                System.out.println("You are living in fourth floor");
                break;
            case 5:
                System.out.println("You are living in fifth floor");
                break;
            default:
                System.out.println("There is no such floor");

        }

        input.close();



    }
}
