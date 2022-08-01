package day31_Constructers;

public class Rectangle {
    public double lenght,width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }
    public double calcArea(){
        return lenght*width;
    }
    public double calcPerimeter(){
        return 2*(lenght+width);
    }


    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", width=" + width +
                ", area=" + calcArea() +
                ", Perimeter=" + calcPerimeter() +
                '}';
    }
}
