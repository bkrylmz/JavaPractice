package home_Work;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        // letters 26 alphabets
     /*   char[] letters = new char[26];



        for (char i = 'a', j = 0;  i <='z' && j< letters.length; i++, j++) {
            letters[j]= i;
        }

        System.out.println(Arrays.toString(letters));
        System.out.println("---");*/

        // Z-A

        char[] alphabets= new char[26];
        //alphabets[0] ='Z';
     //   alphabets[1] ='Y';


char ch ='Z';
        for (int i =0 ; i< alphabets.length;  i++, ch--) {
alphabets[i] = ch;


        }

        System.out.println(Arrays.toString(alphabets));


    }
}
