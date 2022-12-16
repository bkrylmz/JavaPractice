package tasks;

import java.util.Scanner;

public class MiddleNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        /*
        1. Create an object of Scanner class.
2. Declare int 3 variables
3. Use Scanner to assign numbers from console into the variables
4. Use if statements to find the middle number
         */
        if(n1<n2 && n2<n3 || n3 < n2 && n2< n1){
            System.out.println(n2 + " is middle number");
        } else if (n2<n1 && n1<n3 || n3 < n1 && n1< n2) {
            System.out.println(n1 + " is middle number");
        } else if (n2<n3 && n3<n1 || n1 < n3 && n3< n2){ System.out.println(n3 + " is middle number");

        } else {
            System.out.println();
        }


    }
}
