package day31_Constructers.scrumTask;

public class Tester {
    public String name, JobTitle;
    public int ID;
    public double salary;

    public Tester(String name, String jobTitle, int ID, double salary) {
        this.name = name;
        JobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", JobTitle='" + JobTitle + '\'' +
                ", ID=" + ID +
                ", salary= €" + salary +
                '}';


    }

    public void smokeTesting() {
        System.out.println(name + " is smoke testing.");
    }

    public void creatingTicket() {
        System.out.println(name + " is creating a ticket.");
    }

    public void dailyStandUp() {
        System.out.println(name + " is creating a ticket.");
    }


}
