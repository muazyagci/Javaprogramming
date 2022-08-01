package day37_Inheritance.scrumTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, String jobTitle, String companyName, double salary, int id) {
        super(name, age, gender, jobTitle, companyName, salary, id);
    }

    public void createTicket(){
        System.out.println(jobTitle+" "+name+" is creating a ticket");
    }

}
