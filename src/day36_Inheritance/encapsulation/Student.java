package day36_Inheritance.encapsulation;

public class Student {
    private String name;
    private int age;
    private String SchoolName;
    private char gender, grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 90 || age <= 5) {
            System.err.println("Invalid Age");
            return;
        } else {
            this.age = age;
        }

    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String SchoolName) {
        this.SchoolName = SchoolName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            System.err.println("Invalid gender");
            return;//exits the method
        }
        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')) {
            System.err.println("Invalid grade");
            return;
        }
        this.grade = grade;
    }

    public Student(String name, int age, String SchoolName, char gender, char grade) {
        setName(name);
        setAge(age);
        setSchoolName(SchoolName);
        setGender(gender);
        setGrade(grade);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", SchoolName='" + SchoolName + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }

    public void study(){
        System.out.println(name+" is studying");
    }

    public static boolean isStudent=true;

    public static boolean isHuman=true;

}
