package day44_Abstraction.animalTask;

public class Parrot extends Animal  implements Playable,canFly{
    public Parrot(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating chocolate");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing with rope");
    }


    @Override
    public void fly() {
        System.out.println(getName()+" can fly");
    }
}
