package day39_Recaps.ShapeTask;

public class Circle extends Shape{

    private double radius;
    public static double pi;

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

    static {
pi=3.14;
    }

}
