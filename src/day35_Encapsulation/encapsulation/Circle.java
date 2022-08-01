package day35_Encapsulation.encapsulation;

public class Circle {
    private  double radius;
     public double pi;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            System.err.println("Invalid radius");
            return;
        }

        this.radius = radius;
    }

}
