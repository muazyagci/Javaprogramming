package day10_NeftedIf;

import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        Scanner anan=new Scanner(System.in);
        System.out.println("Pls give your age");
    String result= "";


        int age=anan.nextInt();;
        if (age>0||age<150){

            if (age<21){
                result="Teeneger";
            } else if (age>=21&&age<55) {
                result="Adult";
            } else  {
                result="Senior";
            }


        }else {result="Invalid";

        }
        System.out.println(result);

    }
}
