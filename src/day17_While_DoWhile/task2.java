package day17_While_DoWhile;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1= scan.nextInt(), num2= scan.nextInt();
        while (num1>=0&&num2>=0){
            System.out.println(num1+num2);

            num1= scan.nextInt();
            num2= scan.nextInt();
        }
scan.close();
    }
}
