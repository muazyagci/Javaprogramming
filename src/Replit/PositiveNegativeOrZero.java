package Replit;

import java.util.Scanner;

public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String result="";
        if (num>0){
            result="Positive";
        }
if (num<0){
    result="Negative";
}
if (num==0){
    result="Zero";
}
        System.out.println();
    s.close();
    }

}
