package day45_Abstraction_Interface.Shape;

public class Circle {

    private  double radius;
    public final static double pi=3.14;

    public void setRadius(double radius) {
        if (radius<0){
            throw new RuntimeException("Invalid Radius: "+radius);
        }
        this.radius = radius;
    }

}
