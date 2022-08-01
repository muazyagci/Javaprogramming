package day37_Inheritance.Animal;

public class Cat extends Animal {


    public Cat(String name, String breed, String size, String colour, char gender, int age) {
        super(name, breed, size, colour, gender, age);
    }

    public void scratch(){
        System.out.println(name+" is scratching");
    }


    }
