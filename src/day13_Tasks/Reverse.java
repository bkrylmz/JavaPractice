package day13_Tasks;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {


    /*
    Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.

     */
    Scanner scan = new Scanner(System.in);

    while (true) {
        System.out.println("Enter a word");
        String word = scan.next();
        String result = "";

        if (word.length() == 5) {
            result += word.charAt(4);
            result += word.charAt(3);
            result += word.charAt(2);
            result += word.charAt(1);
            result += word.charAt(0);
        } else if (word.length() > 5) {
            result = "too long";
        } else {
            result = "too short";
        }
        System.out.println(result);

    }
    }

}
