package day44_Abstraction.animalTask;

public class Cat extends Animal implements Playable{
    public Cat(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating biryani");
    }

    public void Meow(){
        System.out.println(getName()+" is Meowing");
    }


    @Override
    public void play() {
        System.out.println(getName()+" is playing with lazer");
    }

}
