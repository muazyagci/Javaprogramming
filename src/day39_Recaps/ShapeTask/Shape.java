package day39_Recaps.ShapeTask;

public class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double area(){
        return 0;
    }
    public double perimeter(){
        return 0;
    }

    public Shape(String name) {
        if (name==null){
            System.err.println("Name can not be null");
            System.exit(1);// 1: something went wrong
        }

        if (name.isEmpty()||name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }


        setName(name);

    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
