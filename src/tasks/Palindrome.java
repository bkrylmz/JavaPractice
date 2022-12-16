package tasks;

import java.util.Scanner;
import java.util.SortedMap;

public class Palindrome {
    public static void main(String[] args) {
        /*
        Write a program that can check if the given String is palindrome
			Ex:
				input:
					Level
				output:
					true
				input:
					Anna
				output:
					true
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.next();

        String reverse = "";

        for (int i = word.length()-1; i >= 0 ; i--) {
            char ch = word.charAt(i);
            reverse += ch;
        }
        if (reverse.equalsIgnoreCase(word)) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }










    }
}
