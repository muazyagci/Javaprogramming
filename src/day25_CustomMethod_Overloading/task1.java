package day25_CustomMethod_Overloading;

public class task1 {
    public static void main(String[] args) {
        int sum = sumOf2Numbers(40, 50);
        System.out.println("sum= "+sum);

        int sum2 = sumOf3Numbers(40, 50,60);
        System.out.println("sum2= "+sum2);

        int sum3 = sumOf4Numbers(40, 50,60,70);
        System.out.println("sum3= "+sum3);
    }

    public static int sumOf2Numbers(int num1, int num2) {return num1 + num2;}

    public static int sumOf3Numbers(int num1, int num2, int num3) {return num1 + num2 + num3;}

    public static int sumOf4Numbers(int num1, int num2, int num3, int num4) {return num1 + num2 + num3 + num4;}
}