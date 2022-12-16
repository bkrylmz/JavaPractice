package day18_NestedLoop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Username: ");
        String u = scan.next();

        System.out.println("Enter Your Password: ");
        String p = scan.next();
        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
            System.out.println("Logged In");
        }else{
            for (int i = 1; i < 3 ; i++) {
                System.out.println("Incorrect username or password");
                System.out.println("Enter your username: ");
                u = scan.next();
                System.out.println("Enter Your Password: ");
                p = scan.next();
                if (u.equals("Cydeo") && p.equals("WoodenSpoon"));
                break;

            }
            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) {
                System.err.println("Your account is locked, Please contact support team");
            }

        }
scan.close();




        }

    }

