package day44_Abstraction.animalTask;

public abstract class Animal {
    private String name;
    private final String breed;
    private final char gender;
    private int age;
    private String size;
    private final String colour;

    public final static boolean canBreath;

    static {
        canBreath=true;
        if (canBreath==false){
            throw new RuntimeException();
        }
    }

    public Animal(String name, String breed, char gender, int age, String size, String colour) {
        setName(name);
        this.breed = breed;
        if (!(gender=='M'||gender=='F')){
            throw new RuntimeException("Invalid gender: "+gender);
        } this.gender = gender;

        setAge(age);
        setSize(size);
        this.colour = colour;
    }

    public String getName() {
        if (name.isEmpty()){
            throw new RuntimeException("Invalid name");
        }else return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void drink(){
        System.out.println(name+"is drinking");
    }

    public abstract void eat();

    public String toString() {
        return getClass().getSimpleName()+
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
