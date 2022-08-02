package day39_Recaps.CydeoTask;

public class Tester extends Employee{
    public Tester(String name, char gender, int age, long ID, String jobTitle, double salary) {
        super(name, gender, age, ID, jobTitle, salary);
    }

    public void createTicket(){
        System.out.println(getName()+" has created a ticket");
    }

}
