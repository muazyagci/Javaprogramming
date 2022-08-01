package Replit;

import java.util.Scanner;

public class IfStatamentGrades {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int grade = s.nextInt();
        String result="";
        if (grade>=90){
            result="excellent";
        }else if (grade>70&&grade<90){
            result="Good";
        }else if (grade>60&&grade<70){
            result="pass";
        }else if (grade<=60){
            result="fail";
        }else System.out.println("Invalid number");
        System.out.println(result);
        s.close();
    }
}
