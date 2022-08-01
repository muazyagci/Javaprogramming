package day32_Constructors;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1=new Employee("Mahmut");
        Employee employee2=new Employee("Mahmut","QA",'M');
        Employee employee3=new Employee("Mahmut","QA",'M',50000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

    }
}
