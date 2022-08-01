package Utilities;

public class MathUtility {
    public static void main(String[] args) {
        boolean isodd=oddNumber(5);
        System.out.println(isodd);
        max(5,7);
        min(5,7);
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static int substract(int num1, int num2) {
        return num1 - num2;
    }

    public static double substraction(double num1, double num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(int num1, int num2) {
        return num1 / num2;
    }

    public static boolean evenNumber(int num) {
return (num%2==0)? true:false;
    }

    public static boolean oddNumber(int num) {
        return (num%2!=0)? true:false;
    }

    public static int max(int num1, int num2){
        if (num1>num2){
            System.out.println(num1+ " is Bigger.");
        } else if (num2>num1) {
            System.out.println(num2+" is Bigger.");

        }else{
            System.out.println("num1 equals to num2");

        }


        return num1;
    }

    public static void max(double num1,double num2){
        if (num1>num2){
            System.out.println(num1+ " is Bigger.");
        } else if (num2>num1) {
            System.out.println(num2+" is Bigger.");

        }else{
            System.out.println("num1 equals to num2");

        }
    }

    public static void min(int num1,int num2){
        if (num1<num2){
            System.out.println(num1+ " is Smaller.");
        } else if (num2<num1) {
            System.out.println(num2+" is Smaller.");

        }else{
            System.out.println("num1 equals to num2");

        }
    }

    public static void min(double num1,double num2){
        if (num1<num2){
            System.out.println(num1+ " is Smaller.");
        } else if (num2<num1) {
            System.out.println(num2+" is Smaller.");

        }else{
            System.out.println("num1 equals to num2");

        }
    }

    public static int squareOfInteger(int num){
        return num*num;
    }
    public static double squareOfDouble(double num){
        return num*num;
    }
    public static int cubeOfInteger(int num){
        return num*num*num;
    }

}
