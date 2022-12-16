package TasksDay10;

public class Task6 {
    public static void main(String[] args) {

        double salary = 6500;
        int creditScore = 700;

        String a = (salary>60000 && creditScore>650)? "Loan Approved" : "Loan Denied";
        System.out.println(a);

        // Create a class called Loans, Given two variables salary and credit score,
        // use those given info to determine if you can get a loan.
        //
        //                To be approve for the loan, print: "Loan Approved":
        //                        Salary: above 60,000
        //                        Credit Score: above 650
        //
        //                    Otherwise print: "Loan Denied"
        //
        //              NOTE: MUST USE TERNARY.
    }
}
