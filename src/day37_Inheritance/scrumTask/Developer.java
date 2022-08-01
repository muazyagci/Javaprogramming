package day37_Inheritance.scrumTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, String jobTitle, String companyName, double salary, int id) {
        super(name, age, gender, jobTitle, companyName, salary, id);
    }

    public void fixBugs(){
        System.out.println(jobTitle+" "+name+" is crying");
    }


}
