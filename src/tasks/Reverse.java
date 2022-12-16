package tasks;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        String reverse = "";

        for (int i = word.length()-1; i >= 0; i--) {
            char ch = word.charAt(i);
            reverse += ch;

        }
        System.out.println(reverse);


    }
}
