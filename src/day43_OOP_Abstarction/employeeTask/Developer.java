package day43_OOP_Abstarction.employeeTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" developing the application");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " sleeps 8 hours");
    }

}
