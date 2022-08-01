package day31_Constructers;

public class Student {
    public String name;
    public char gender,grade;
    public int age, ID;

    public Student(String name, char gender, char grade, int age, int ID) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        this.age = age;
        this.ID = ID;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", age=" + age +
                ", ID=" + ID +
                '}';
    }

}
