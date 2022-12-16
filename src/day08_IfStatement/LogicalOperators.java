package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {

        int age = 14;
        String citizen = "USA",
        name = "Aaron";

        boolean isEligible = age >=18 && citizen == "USA";
        System.out.println(name + " is eligible to vote:" + isEligible);
        System.out.println("-------------------------------------------");
        String name2 = "John";
        int creditscore = 720;
        int age2 = 23;
        int income = 40000;

        boolean isEligible2 = creditscore > 700 && age2 >= 21 && income >= 60000;
        System.out.println( name2 + " is eligible for loan: " + isEligible2);
        System.out.println("-----------------------------------------------------");

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';
        boolean isEligible3 = age3 >= 18 && gender == 'F' || gender == 'M';
        System.out.println(name3 + " is eligible for loan " + isEligible3);
        System.out.println("----------------------------------------------");

        String student = "Ali";
        double gpa = 2.5;
        int familyIncome = 120000;
        boolean isEligible4 = gpa >= 3.5 || familyIncome <= 60000;
        System.out.println(student + " is eligible for schoolship "+ isEligible4);

        System.out.println("------------------------------------------------------");
        int score = 85;
        boolean passed = score >= 60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);
        








    }







}
