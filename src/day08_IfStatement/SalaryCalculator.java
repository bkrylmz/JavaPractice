package day08_IfStatement;

public class SalaryCalculator {
    public static void main(String[] args) {

         int hourlyRate = 50,
                 weeklyhour = 45;
        double stateTaxRate = 6.5,
                federalTaxRate = 26.2;

        int salaryBeforeTax = hourlyRate * weeklyhour * 52 ;
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate /100;
        double totalTax = stateTax + federalTax;
        double salaryAfter = salaryBeforeTax - totalTax;
        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("State tax = $"+ stateTax);
        System.out.println("Federal tax = $" + federalTax);
        System.out.println(" Total tax = $" + totalTax);
        System.out.println("Net income = $"+ salaryAfter);










    }















}
