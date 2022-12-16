package tasks;

import java.util.Scanner;

public class VerifyEquals {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();
        boolean value = word1.equals(word2);
        System.out.println("value = " + value);
        /*
        Use `String methods` to check if the two given words, `word1` and `word2` are the same (equal).
         The values of `word1` and `word2` will be inputs from a Scanner,
          but you only need to interact with the String variables. Output a `boolean value, true or false`.

#### Note: Comparison should be case sensitive. "java" and "JaVa" are not equal.
         */





    }
}
