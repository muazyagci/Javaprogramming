package day43_OOP_Abstarction.employeeTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int id,double salary) {
        super(name, age, gender, id, "Tester", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is testing the application");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 8 hours in a day");
    }

}
