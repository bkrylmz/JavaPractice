package tasks;

import java.util.Scanner;

public class FindTheLenth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Use `String methods` to find the number of characters for the given `word` variable.
        The value of the `word` will be input from a Scanner, but you only need to interact with the
        String variable. Output in the following format:

#### Length is: $length
         */
        String word = scan.next();
        int length = word.length();
        System.out.println("Length is: $" + length);





    }
}
