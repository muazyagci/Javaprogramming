package day45_Abstraction_Interface.Shape;

public class Square extends Shape{

    private double side;

    public Square(double side) {
        super("Square");
       setSide(side);
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0){
            throw new RuntimeException("Invalid side");
        }
        this.side = side;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString()+
                "side=" + side +
                '}';
    }
}
