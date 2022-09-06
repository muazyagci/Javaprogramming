package day47_Polimorphism;

import day43_OOP_Abstarction.employeeTask.Developer;
import day43_OOP_Abstarction.employeeTask.Employee;
import day43_OOP_Abstarction.employeeTask.Tester;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction_Interface.Shape.Circle;
import day45_Abstraction_Interface.Shape.Shape;
import day45_Abstraction_Interface.Shape.Square;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
        Shape shape=(Shape) new Circle(4);

        Shape shape2= new Circle(5);
        System.out.println(shape2.perimeter());

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        Dog animal2 = new Dog("Lucy", "Husky", 'F', 3, "Small", "White");

        animal2.bark();

        ((Dog)animal).bark();

      Shape shape1=new Square(5);

        System.out.println( ((Square) shape1).getSide() );

        System.out.println("-------------------------------------------");

        Animal animal3=new Cat("Jim","Scotish",'M',3,"Small","White");

        ((Cat) animal3).meow();

        // ((Dog)animal3).bark();

        System.out.println("-------------------------------------------");

        Employee employee=new Developer("Mark",26,'M',321456,"UI developper",100000);

        //((Tester)employee).bugReport();

        Employee employee2=new Tester("Mark",26,'M',321456,"QA tester",100000);

        ((Tester)employee2).bugReport();

        String num="12345";



    }
}
