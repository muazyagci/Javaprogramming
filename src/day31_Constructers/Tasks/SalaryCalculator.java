package day31_Constructers.Tasks;

public class SalaryCalculator {
    public double hourlyRate,stateTaxRate,federalTaxRate,weeklyHours;


    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=€" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                '}';
    }

    public double salary(){
        double salary=hourlyRate*weeklyHours*52;

        return salary;
    }
public double stateTax(){
    System.out.print("Amount for state tax is: ");
        return stateTaxRate/100*salary();
}
public double federalTax(){
    double federalTax=federalTaxRate/100*salary();
    System.out.print("Amount for federal tax is: "+federalTax);

        return federalTax;
}
    public double salaryAfterTax(){
        double salaryAfterTax=salary()-(stateTax()+federalTax());
       // System.out.println("Salary Tax rate is "+stateTaxRate/100*salary());
        System.out.println();
        System.out.print("Salary after tax is: ");
        return salaryAfterTax;
    }

}
