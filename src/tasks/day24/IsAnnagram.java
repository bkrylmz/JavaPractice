package tasks.day24;

import bekir.BankObjectives;
import day21_ForEachLoop.Anagram;

public class IsAnnagram {

    public static boolean isAnagram (String word){
        boolean isAnagram = false;
        String reverse = "";
        for ( int i = word.length()-1; i >= 0; i--) {
            reverse += word.charAt(i);
            if (reverse.equalsIgnoreCase(word)) {
            isAnagram = true;
            }
        }
        return isAnagram;
    }

    public static void main(String[] args) {
        boolean b1 = isAnagram("kabak");

        System.out.println(b1);
    }






}
