package tasks;

import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int multiply = 1;


        for (int i = 0; i < 2 ; i++) {
            int num = scan.nextInt();
            multiply *= num;
        }
        System.out.println(multiply);


    }
}
