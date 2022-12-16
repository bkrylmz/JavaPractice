package day17_While_DoWhile;

import java.util.Scanner;
import java.util.SortedMap;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:  ");
        String u = scan.next();
        System.out.println("Enter your password:");
        String p = scan.next();
        if(u.equals("Cydeo")&& p.equals("Cydeo123")){
            System.out.println("Logged in");
        }else{
            int attemps  = 3;
            while (!(u.equals("Cydeo") && p.equals("Cydeo123") && attemps < 0 )){
                if (attemps == 1) {
                    System.out.println("THIS IS YOUR LAST CHANCE");
                }
                }
                System.out.println("Incorrect username or password ");
                System.out.println("Enter your username: ");
                u = scan.next();
                System.out.println("Enter your password:");
                p = scan.next();
                attemps--;
            }
            if(u.equals("Cydeo") && p.equals("Cydeo123")){
                System.out.println("Logged in");
            }else{
                System.out.println("Your account is locked");
            }
        }









    }

