package day39_Recaps.ShapeTask;

public class Rectangle extends Shape{

private double length,width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<=0){
            System.err.println("Invalid length");
            System.exit(1);
        }

        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<=0){
            System.err.println("Invalid width");
            System.exit(1);
        }

        this.width = width;
    }

    public Rectangle(String name, double length, double width) {
        super(name);
        setLength(length);
        setWidth(width);
    }

}
