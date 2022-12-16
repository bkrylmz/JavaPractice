package tasks;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num > 0){
            System.out.println(num + " is positive number");
        } else if (num < 0) {
            System.out.println(num + " is negative number");
        } else{
            System.out.println(num + " is zero");
        }


    }
}
