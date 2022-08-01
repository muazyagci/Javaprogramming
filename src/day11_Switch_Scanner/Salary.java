package day11_Switch_Scanner;

public class Salary {
    public static void main(String[] args) {
        double taxrate=0.35;
double salary=130000;

boolean ismarried=true;


            if (salary>=130000){
                taxrate=0.35;
        } else if (salary>=100000) {
                taxrate=0.30;
            } else if (salary>=80000) {
                taxrate=0.25;
            }else
taxrate=0.20;

      if (ismarried){// if the person is married
          taxrate-=0.05;
      }
       double salaryafteratx= salary-(salary*taxrate);
        System.out.println("salaryafteratx = " + salaryafteratx);














    }}

