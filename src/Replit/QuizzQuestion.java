package Replit;

import java.util.Scanner;

public class QuizzQuestion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:");
        System.out.println("a)venus");
        System.out.println("b)pluto");
        System.out.println("c)neptune");

        String a = scan.nextLine();
        String result = "";
        switch (a) {
            case "a":
                result = a + " is wrong";
                break;
            case "b":
                result = a + " is correct";
                break;
            case "c":
                result = a + " is wrong";
                break;
            default:
                result = a + " is not a valid answer";
        }
        System.out.println(result);
        scan.close();
    }
}
