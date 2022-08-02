package day39_Recaps.CydeoTask;

public class Tester extends Employee{
    public Tester(String name, char gender, int age, long ID, String jobTitle, double salary) {
        super(name, gender, age, ID, jobTitle, salary);
    }

    public void createTicket(){
        System.out.println(getJobTitle()+" "+getName()+" is creating");
    }

    @Override
    public void work() {
        super.work();
    }
}
