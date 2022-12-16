package tasks;

import java.util.Scanner;

public class StartAndEndWith {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        boolean startsWithA = word.startsWith("a");
        boolean endsWithE = word.endsWith("e");
        System.out.println(startsWithA);
        System.out.println(endsWithE);

        /*Use `String methods` to check if the given `word` starts with the letter `a` and
        ends with the letter `e`.
         Print two boolean values to represent each:

> Starts with a: $boolean

                > Ends with e: $boolean*/







    }
}
