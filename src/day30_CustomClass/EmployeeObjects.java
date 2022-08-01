package day30_CustomClass;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        Employee employee2=new Employee();
        Employee employee3=new Employee();
        Employee employee4=new Employee();
        Employee employee5=new Employee();

        employee1.setInfo("Erhan","Guvenlik",25,4567,'M',true,45600);
        employee2.setInfo("Abdulhey","Guvenlik",35,475,'M',true,80600);
        employee3.setInfo("Memati","Guvenlik",40,895,'M',true,100600);
        employee4.setInfo("Pusat","Guvenlik",20,3658,'M',true,50000);
        employee5.setInfo("Kara","Guvenlik",39,78645,'M',true,70600);

        Employee[] employees={employee1,employee2,employee3,employee4,employee5};
        int countFullTime=0;
        int countPartTime=0;
double max= employees[0].salary;
double min= employees[0].salary;

        for (Employee employee : employees) {
            if (employee.isFullTime){
                countFullTime++;
            }else {
                countPartTime++;
            }
            if (employee.salary>max){
                max=employee.salary;
            }

            if (employee.salary<min){
                min=employee.salary;
            }
        }
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        
    }
}
