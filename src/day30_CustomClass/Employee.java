package day30_CustomClass;

public class Employee {
    public String name;
    public String role;
    public int age;
    public int ID;
    public char gender;
    public boolean isFullTime;
    public double salary;

    public void setInfo(String name, String role, int age, int ID, char gender, boolean isFullTime, double salary) {
        this.name = name;
        this.role = role;
        this.age = age;
        this.ID = ID;
        this.gender = gender;
        this.isFullTime = isFullTime;
        this.salary = salary;
    }

public void work(){
    System.out.println(role+" "+name+" is working");
}

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                ", gender=" + gender +
                ", isFullTime=" + isFullTime +
                ", salary=" + salary +
                '}';
    }

}
