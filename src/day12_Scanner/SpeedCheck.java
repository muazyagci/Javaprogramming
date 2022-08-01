package day12_Scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       int speedlimit=50;
        System.out.println("SpeedLimit= "+speedlimit);
        System.out.println("Please enter your speed");
        int currentspeed= scan.nextInt();

    if (currentspeed>speedlimit){
        System.out.println("You are driving over the speed limit. Slow down!");
    }else System.out.println("");




    }
}
