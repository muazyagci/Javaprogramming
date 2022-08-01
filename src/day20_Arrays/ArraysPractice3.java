package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    System.out.println("How many numbers would you like to enter");
    int length = scan.nextInt();

    if (length<=0){
        System.err.println("invalid entry");
    System.exit(0);

    }


int[]number=new int[length];
        for (int i = 0; i <length ; i++) {
            System.out.println("Enter a number");
            number[i]= scan.nextInt();// each input useer provided during each execution of the loop, will be assigned to the indexes of the array

        }
        System.out.println(Arrays.toString(number));
        scan.close();

    }
}
