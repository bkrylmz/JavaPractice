package tasks;

import java.util.Scanner;

public class WithoutFirstLastChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        /*
        Use `String methods` to print the given `word` without the first character and
         another output of the `word` without the last character.
         The value of the `word` will be input from a Scanner,
         but you only need to interact with the String variable. Output in the following format:

> without first letter: $word without the first character

> without last letter: $word without the last character
         */

        String withoutFirstLetter = word.replace(word.charAt(0), ' ');
        String withoutLastLetter = word.replace(word.charAt(word.length()-1),' ' );
        System.out.println("withoutFirstLetter = " + withoutFirstLetter);
        System.out.println("withoutLastLetter = " + withoutLastLetter);








    }
}
