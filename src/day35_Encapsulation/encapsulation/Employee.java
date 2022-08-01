package day35_Encapsulation.encapsulation;

public class Employee {
    public String name;
    public char gender;
    public int age;
    public double salary;

    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.err.println("Name shouldn't be empty");
            System.exit(0);
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(char gender) {
        if (gender == 'F' || gender == 'M') {
            this.gender = gender;
        } else {
            System.err.println("Invalid gender");

        }


    }

    public char getGender() {
        return gender;
    }

    public void setAge(int age) {
        if (age <= 16 || age > 90) {
            System.err.println("Invalid age");
            return;
        }

        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.err.println("Invalid salary");

            return;

        }

        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
