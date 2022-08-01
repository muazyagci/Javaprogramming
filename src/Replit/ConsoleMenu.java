package Replit;

import java.util.Scanner;

public class ConsoleMenu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("---------------");
        System.out.println("select an option:");
        System.out.println("1) option 1");
        System.out.println("2) option 2");
        System.out.println("3) option 3");
        System.out.println("---------------");

        int choice = s.nextInt();
String result="";
if (choice==1){
    result="user selected 1";
}
if (choice==2){
    result="user selected 2";
}
if (choice==3){
    result="user selected 3";
}
        System.out.println(result);
s.close();
    }
}
