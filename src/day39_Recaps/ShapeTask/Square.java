package day39_Recaps.ShapeTask;

public class Square extends Shape{
    public double side;
    public Square(String name,double side) {
        super(name);
        this.side=side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "side='" + side + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';

    }
}
