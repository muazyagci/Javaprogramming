package day39_Recaps.CydeoTask;

public class Developer extends Employee{

    public Developer(String name, char gender, int age, long ID, String jobTitle, double salary) {
        super(name, gender, age, ID, jobTitle, salary);
    }

    public void fixingBugs(){
        System.out.println(getJobTitle()+" "+getName()+" is fixing the bug");
    }

}
