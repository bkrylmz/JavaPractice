package tasks;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        /*
        Write a program that can divide two positive numbers without using / (division)
        and * (multiplication) operators.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int num1 = scan.nextInt();
        System.out.println("Enter a  number = ");
        int num2 = scan.nextInt();

        int count = 0;

        while (num1 >= num2){
            num1 -= num2;
            count++;
        }
        System.out.println(count + " with remainder of " + num1);


    }
}
