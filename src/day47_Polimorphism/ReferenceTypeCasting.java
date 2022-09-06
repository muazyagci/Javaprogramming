package day47_Polimorphism;

import day45_Abstraction_Interface.Shape.Circle;
import day45_Abstraction_Interface.Shape.Shape;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
        Shape shape=(Shape) new Circle(4);

        Shape shape2= new Circle(5);

    }
}
