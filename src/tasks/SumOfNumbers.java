package tasks;

import day17_While_DoWhile.WhileLoopIntro;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum= 0;


        while (true){
            System.out.println("Enter a number ");
            int number = scan.nextInt();
            if (number < 0 ) {
                break;
            }
            sum += number;
        }
        System.out.println(sum);








    }
}
