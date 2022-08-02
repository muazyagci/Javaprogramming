package day39_Recaps.CydeoTask;

public class Person {

    private String name;
    private char gender;
    private int age;

    public String getName() {


        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            System.err.println("Invalid Name");
            System.exit(1);
        }

        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender=='M'||gender=='F'){
            this.gender = gender;
        }
        else {
            System.err.println("Invalid Gender");
            System.exit(1);
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            System.err.println("Invalid age");
        System.exit(1);

        }
        this.age = age;
    }

    public Person(String name, char gender, int age) {
       setName(name);
       setGender(gender);
       setAge(age);
    }


}
