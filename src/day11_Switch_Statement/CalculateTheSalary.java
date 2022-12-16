package day11_Switch_Statement;

public class CalculateTheSalary {
    public static void main(String[] args) {
        int salary = 90_000;
        double taxRate = 0;
        boolean isMaried = true;

        if (salary>= 130_000){taxRate = 0.35;}
        else if (salary >= 100_000){taxRate = 0.30;} else if (salary >= 80_000) {taxRate = 0.25;}
        else {taxRate = 0.20;}

        if (isMaried){taxRate -= 0.05;}
        double afterTaxSalary = salary - (salary * taxRate);

        System.out.println("After Tax Salary = " + afterTaxSalary);


    }
}
