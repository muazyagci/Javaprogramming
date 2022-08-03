package day40_FinalKeyword;

public class Animal {
    private String name;
    final private String breed;
    final private char gender;
    private final String colour;
    private String size;
    private int age;

    public Animal(String name, String breed, char gender, String colour, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.colour = colour;
        this.size = size;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getColour() {
        return colour;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    //----------Setters-------------------


    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
