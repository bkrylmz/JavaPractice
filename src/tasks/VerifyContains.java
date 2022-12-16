package tasks;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class VerifyContains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.nextLine();
        System.out.println("Enter a sentence: ");
        String sentence = scan.nextLine();
        boolean contain = sentence.contains(word);
        System.out.println(contain);


        /*
        ### Use `String methods` to verify if the given `sentence` contains the given `word`.
        The values of `sentence` and `word` will be inputs from a Scanner,
         but you only need to interact with the String variables. Output a `boolean value, true or false`.

Main topics: String manipulation, Scanner, methods, primitive datatypes

```
Ex:
  Input:
    Word: AirPods

    Sentence: Did you just get some AirPods for Christmas?

  Output:
    true
         */





    }
}
