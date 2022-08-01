package day35_Encapsulation.encapsulation;

public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0 || age > 128) {
            System.err.println("Invalid age");
            return;
        }

        this.age = age;
    }


}
