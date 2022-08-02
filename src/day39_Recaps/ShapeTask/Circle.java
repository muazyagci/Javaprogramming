package day39_Recaps.ShapeTask;

public class Circle extends Shape{

    private double radius;
    public static double pi=3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            System.err.println("Invalid radius");
            System.exit(1);
        }

        this.radius = radius;
    }



    public Circle(double radius) {
        super("Circle");
        setRadius(radius);

    }

    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return 2*radius*pi;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "pi=" + pi +
                "area=" + area() +
                "perimeter=" + perimeter() +
                '}';
    }

}
