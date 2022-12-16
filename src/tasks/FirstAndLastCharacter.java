package tasks;

import java.util.Scanner;

public class FirstAndLastCharacter {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        //WRITE YOUR CODE HERE
        //Change the bad word `dumb` into `cool`

        System.out.println(word.replace ("bad" , "cool") );






    }
}
