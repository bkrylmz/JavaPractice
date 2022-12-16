package tasks;

import java.util.Scanner;

public class new2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next().toLowerCase();

        if(word.charAt(0)=='x' && word.charAt(word.length()-1)=='x'){
            System.out.println(word.substring(1,word.length()));

        }else{
            System.out.println(word);
        }


    }
}
