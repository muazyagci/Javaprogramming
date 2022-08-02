package day39_Recaps.CydeoTask;

public class Employee extends Person{
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

    public Employee(String name, char gender, int age, long ID, String jobTitle, double salary) {
        super(name, gender, age);
        setID(ID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public void work(){
        System.out.println(getName()+" is working.");
    }


    @Override
    public String toString() {
        return "Employee{" +
                " name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                " ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

}
