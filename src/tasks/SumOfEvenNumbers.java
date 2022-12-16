package tasks;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {

        /*Write a program that can return the factorial number of any given number */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();

        int factorial = 1;

        for (int i = 1; i <= number ; i++) {
            factorial *= i;

        }

        System.out.println(factorial);






    }
}
