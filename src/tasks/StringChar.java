package tasks;

import java.util.Scanner;

public class StringChar {
    public static void main(String[] args) {
        /*
        Write a program that asks user to entera string and a char,
        the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';
                output: 3
                inputs:
                    "Java programming language"
                    'g'
                output: 4
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string a char");
        String str = scan.nextLine();
        char ch = scan.next().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachCharacter = str.charAt(i);
            if (eachCharacter == ch) {
                count++;
            }
        }
        System.out.println(count);


    }
}
