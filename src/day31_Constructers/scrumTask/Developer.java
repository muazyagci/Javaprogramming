package day31_Constructers.scrumTask;

public class Developer {
    public String name, jobTitle;
    public int ID;
    public double salary;

    public Developer(String name, String jobTitle, int ID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary= €" + salary +
                '}';
    }

    public void coding() {
        System.out.println(name + " is coding");
    }

    public void unitTesting() {
        System.out.println(name + " is unit testing");
    }

    public void fixingBug() {
        System.out.println(name + " is fixing bug");
    }


}
