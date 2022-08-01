package day37_Inheritance.scrumTask;

public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(String name, int age, char gender,String companyName, double salary, int id) {
        super(name, age, gender, "BA", companyName, salary, id);
    }

    public void analyze(){
        System.out.println(name+" is analyzing the documents");
    }



}
