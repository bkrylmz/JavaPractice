package tasks;

import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;

public class Divisible {
    public static void main(String args[]) {
       /* Write a program that can print the numbers between 1 ~ N that can be divisible by 3, 5, and 15.
	            if the number can be divisible by 3, 5 and 15,
	                then it should only be displayed in DivisibelBy15' section
	            if the number can be divisible by 3 but cannot be divisible by 15,
	                then it should only be displayed in DivisibelBy3' section
	            if the number can be divisible by 5 but cannot be divisible by 15,
	                then it should only be displayed in DivisibelBy5' section
	            EX:
	                input: 100
	                Output:
	                     Divisible By 15 15 30 45 60 75 90
	                     Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
	                     Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        String divisible15 = "";
        String divisible3 = "";
        String divisible5 = "";



        for (int i = 1; i <= number; i++) {
            if (i % 15 == 0) {
               divisible15 += i +" ";
            }
           if (i % 5 == 0){
                divisible5 += i +" ";
            }
           if (i % 3 == 0) {
                divisible3 += i +" ";
            }

        }
        System.out.println("divisible15 = " + divisible15);
        System.out.println("divisible3 = " + divisible3);
        System.out.println("divisible5 = " + divisible5);





    }
}
