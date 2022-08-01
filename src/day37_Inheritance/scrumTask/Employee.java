package day37_Inheritance.scrumTask;

public class Employee extends Person {//Employee IS a Person
    public Employee(String name, int age, char gender, String jobTitle, String companyName, double salary, int id) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.id = id;
    }

    public String jobTitle,companyName;

    public double salary;
    public int id;

    public void work(){
    System.out.println(name+" is working");
}



    public String toString() {
        return "Employee{" +
                ", name='" + name + "  "  +
                ", age=" + age +"  " +
                ", gender=" + gender +"  " +
                "jobTitle='" + jobTitle + "  " +
                ", companyName='" + companyName + "  " +
                ", salary=" + salary +"  " +
                ", id=" + id +"  " +
                '}';
    }
}

