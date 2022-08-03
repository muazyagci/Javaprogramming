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
}
