package day19_LoopPractices;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }
            System.out.println("Would you like another number? yes/no");
            String answer = scan.next();
            if (!(answer.equalsIgnoreCase("no")||answer.equalsIgnoreCase("yes"))) {
                System.out.println("Invalid Entry");
                System.exit(0);
            }
            
            
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you");
                break;
            }


        }

    }
}
