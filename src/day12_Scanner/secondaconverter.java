package day12_Scanner;

import java.util.Scanner;

public class secondaconverter {
    public static void main(String[] args) {
       /* int input=3600;

int hours=input%3600;


        System.out.println("hours = " + hours);
        System.out.println("num = " + input);
int a=5;
        System.out.println(a-4);
        System.out.println("a = " + a);


        Scanner scan=new Scanner(System.in);
        System.out.println(scan.nextInt());
*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter seconds:");
        int inputSeconds= scan.nextInt();
        int hours;
        int minutes;
        int seconds;
       hours=inputSeconds/3600;
       inputSeconds=inputSeconds%3600;
minutes=inputSeconds/60;
inputSeconds=inputSeconds%60;
seconds=inputSeconds;
        System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");
int num1;
num1=scan.nextInt();
        System.out.println("num1 = " + num1);

        }
    }

