package Replit;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int day = scan.nextInt();

        if (day >= 1 && day <= 7) {
            String result = "";
            switch (day) {
                case 1:
                    result = "Monday";
                    break;
                case 2:
                    result = "Tuesday";
                    break;
                case 3:
                    result = "Wednesday";
                    break;
                case 4:
                    result = "Thursday";
                    break;
                case 5:
                    result = "Friday";
                    break;
                case 6:
                    result = "Saturday";
                    break;
                default:
                    result = "Sunday";
            }
            System.out.println(result);
        } else System.out.println("Not a valid day");
    scan.close();
    }
}
