package TasksDay15;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int n = 1;

        for (int i = number; i >=1 ; i--) {
            n *= i;
        }
        System.out.println(n);
//4. Write a program that can return the factorial number of any given number
//
//            Ex:
//                input: 5
//                output: 120
//
//                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )


    }
}
