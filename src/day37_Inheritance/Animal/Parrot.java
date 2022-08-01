package day37_Inheritance.Animal;

public class Parrot extends Animal {
    public String parrotWingColour;

    public Parrot(String name, String breed, String size, String colour, char gender, int age,String parrotWingColour) {
        super(name, breed, size, colour, gender, age);
        this.parrotWingColour=parrotWingColour;
    }
    public void sing(){
        System.out.println(name+" is singing");
    }



}
