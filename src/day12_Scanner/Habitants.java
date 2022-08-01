package day12_Scanner;

import java.util.Scanner;

public class Habitants {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter how many people you live with");
        int numliveswth= scan.nextInt();
       String result="";
       if (numliveswth<3){
       result="lives with less than 3 people";

        }else if (numliveswth>=3&&numliveswth<=6){
           result="Live with 3 - 6 peoples";
        }else result="Live with more than 6 people";
        System.out.println("result = " + result);




    }
}
