package tasks;

import java.util.Scanner;

public class HalfTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        /*
        Use `String methods` to print the first half of the given `word`, twice. 
        Find the beginning half of the String and concatenation it twice.
         */
        String newword = "" + word.charAt(0) + word.charAt(1) + word.charAt(0) + word.charAt(1);
        System.out.println("newword = " + newword);
                
                
                
                
    }
}
