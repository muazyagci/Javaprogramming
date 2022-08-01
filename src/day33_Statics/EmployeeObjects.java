package day33_Statics;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        Employee employee2=new Employee();
        Employee employee3=new Employee();
        employee1.name="Ahmet";
        employee2.name="mehmet";
        employee3.name="karahan";
employee1.salary=74000;
employee2.salary=50000;
employee3.salary=600000;
employee1.isHuman=true;
employee2.isHuman=true;
employee3.isHuman=true;
        System.out.println(employee1.name+" : "+employee1.salary);
        System.out.println(employee2.name+" : "+employee2.salary);
        System.out.println(employee3.name+" : "+employee3.salary);

    }
}
