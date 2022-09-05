package day46_Polimorphism;

import day45_Abstraction_Interface.Shape.Circle;
import day45_Abstraction_Interface.Shape.Square;

import java.util.Arrays;

public class PolymorphismIntro {
    public static void main(String[] args) {
        String str="Wooden Spoon";

        Integer n1=2;

        Double b2=5.5;

        Boolean r1=true;

       Object[] array={str,n1,b2,r1,new Circle(4),new Square(4)};
        System.out.println(Arrays.asList(array));


    }
}
