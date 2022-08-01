package day12_Scanner;

import java.util.Scanner;

public class circlePractice {
    public static void main(String[] args) {

        Scanner circle=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius=circle.nextDouble();
        double are=radius*3.14;
        double peri=2*radius*3.14;
        System.out.println("area= "+are);
        System.out.println("Perimeter= "+peri);

        circle.close();



    }
}
