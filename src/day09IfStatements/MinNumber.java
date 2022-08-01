package day09IfStatements;

public class MinNumber {
    public static void main(String[] args) {
        int num1=5;
        int num2=4;
/*
        if (num1>num2){
            System.out.println(num2+" is minimum number");
        }
        if (num2>num1){
            System.out.println(num1+" is minimum number");
        }
        if (num1==num2){
            System.out.println("Equal");
        }

 */

boolean num1ismin=num1<num2;
boolean num2ismin=num2<num1;
boolean equal=num1==num2;

if (num1ismin){//if num1 is minimum number
    System.out.println(num1+" is the minimum number");
}
if (num2ismin){//if num2 is the minimum number
    System.out.println(num2+" is the minimum number");
}
if (equal){//if they are equal
    System.out.println("equal");
}







    }
}


