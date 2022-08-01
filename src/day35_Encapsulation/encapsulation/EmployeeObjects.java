package day35_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1=new Employee("Mahmut",'M',31,28000);

        System.out.println(employee1+"\n");

        Employee employee2=new Employee("",'F',32,38000);

        System.out.println(employee2+"\n");

employee2.setSalary(employee2.salary+7000);
        System.out.println(employee2+"\n");
    }


}
