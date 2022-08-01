package day36_Inheritance.AnimalTask;

public class Animal {

    public String name,breed,size,colour;
    public char gender;
    public int age;

    public void setInfo(String name, String breed, String size, String colour, char gender, int age) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.colour = colour;
        this.gender = gender;
        this.age = age;
    }
    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+" is drinking");
    }

    public void move(){
        System.out.println(name+" is moving");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }



}

