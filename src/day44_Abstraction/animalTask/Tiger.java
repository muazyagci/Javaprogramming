package day44_Abstraction.animalTask;

public class Tiger extends Animal implements wildAnimal{
    @Override
    public void hunt() {
        System.out.println(getName()+" hunts deer");
    }

    public Tiger(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ "is eating deer");
    }

}
