package day37_Inheritance.Animal;

public class Dog extends Animal{
public int a;

    public Dog(String name, String breed, String size, String colour, char gender, int age, int a) {
        super(name, breed, size, colour, gender, age);
        this.a=a;
    }

    public void barks(){
        System.out.println(name+" is barking");
    }

    public String toString() {
        return "Dog{" +
                "a=" + a +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}

