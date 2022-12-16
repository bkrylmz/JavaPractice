package tasks;

import java.util.Scanner;

public class HasJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean exists = false;
        String word = scan.next().toLowerCase();
        if(word.charAt(0) == 'j' && word.charAt(1)== 'a' && word.charAt(2)== 'v'&& word.charAt(3)== 'a'){
            System.out.println("true");
        } else if (word.charAt(1) == 'j' && word.charAt(2)== 'a' && word.charAt(3)== 'v'&& word.charAt(4)== 'a') {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        /*
        Use `String methods` to check if the given `word` contains the text
        `java`, but not anywhere in the String.
        The `java` text must be in either position 0 or position 1 of the String.
        If the text `java` appears in any other position it is not valid and
        is not considered to be found in the String. Output a `boolean value, true or false`.

#### Note: You won't be able to just use contains method
         */





    }
}
