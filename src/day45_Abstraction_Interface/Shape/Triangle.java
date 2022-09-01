package day45_Abstraction_Interface.Shape;

public class Triangle extends Shape{
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    public Triangle(String name) {
        super(name);
    }
}
