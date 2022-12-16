package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        char[] letters = new char[26];


        System.out.println(Arrays.toString(letters));
       /* for (char  i = 'A'; i <= 'Z'; i++) {
            System.out.println((char)(i));

        }*/
        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i] = ch++;
        }
        System.out.println(Arrays.toString(letters));

        char[] letters2 = new char[26];








    }
}
