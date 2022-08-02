package day39_Recaps.CydeoTask;

public class Employee {
    private long ID;
    private String jobTitle;
    private double salary;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        if (ID<=0){
            System.err.println("Invalid ID");
            System.exit(1);
        }

        this.ID = ID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle.isEmpty()){
            System.err.println("Invalid jobTitle");
            System.exit(1);
        }

        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<=0){
            System.err.println("Invalid salary");
            System.exit(1);
        }

        this.salary = salary;
    }

}
