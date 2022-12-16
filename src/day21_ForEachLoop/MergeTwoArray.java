package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        String[] arr1 ={"Ali", "Layan", "Aysenur"};
        String[] arr2 = {"Maria", "Aygun", "Duygu", "Suat", "Valery"};

        String[] students = new String[arr1.length+ arr2.length];

        int i = 0;
        for (String each : arr1) {
            students[i++] = each;
        }
        for (String each : arr2) {
            students[i++] = each;
        }
        System.out.println(Arrays.toString(students));


        System.out.println("-------------------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G','H'};

        char[] chars = new char[ch1.length + ch2.length];

        int j = 0;

        for (char ch : ch1) {
            chars [j]= ch;
            j++;
        }

        for (char ch : ch2) {
            chars [j] = ch;
            j++;
        }

        System.out.println(Arrays.toString(chars));










    }
}
