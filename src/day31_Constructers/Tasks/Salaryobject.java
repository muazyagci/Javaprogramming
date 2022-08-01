package day31_Constructers.Tasks;

import day11_Switch_Scanner.Salary;

public class Salaryobject {
    public static void main(String[] args) {
        SalaryCalculator employee1=new SalaryCalculator(12.0,10,30,40);
        System.out.println(employee1);

        System.out.println(employee1.salary());
        System.out.println(employee1.salaryAfterTax());
        System.out.println(employee1.stateTax());
        System.out.println(employee1.federalTax());
    }
}
