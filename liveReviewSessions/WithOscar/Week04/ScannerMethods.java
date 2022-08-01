package WithOscar.Week04;

import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {
        /*
        Scanner is a class, and from this class we create objects so we can get input from console
         */

        System.out.println("Output");
/*
DataType variableName/referenceName = someValue
Scanner scan/input/justSomeName = new Scanner(System.in)
new Scanner(System.in) -----> object of Scanner:this object can now reach our methods
next() --> String inputs
next.Int()---> integer dataTypes
 */

        int x=5;

        // Create your scanner object and import util library
        Scanner scan=new Scanner(System.in);

        // Prompt user for an input
        System.out.println("Enter an Integer number: ");

        // pick up the value
        int y= scan.nextInt();


        // use tha value
        int sum=x+y;
        System.out.println("sum = " + sum);
scan.close();

    }
}
