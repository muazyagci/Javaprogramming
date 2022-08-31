package day44_Abstraction.animalTask;

public class Eagle extends Animal implements wildAnimal,canFly
{
    public Eagle(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    @Override
    public void eat() {

    }

    @Override
    public void hunt() {
        System.out.println(getName()+" hunts deer");
    }


    @Override
    public void fly() {
        System.out.println(getName()+" can fly");
    }
}
