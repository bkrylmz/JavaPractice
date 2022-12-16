package day20_Arrays;

import java.util.Arrays;


public class ArraysIntro {
    public static void main(String[] args) {
        String[] myGroup = new String[5];

        int[] myAge = new int[4];

        
        System.out.println(Arrays.toString(myAge));

        System.out.println("-------------------");
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(days));

        int number = 5;

        if (number < 1 ||number > 7 ) {
            System.err.println("Invalid Number");
            System.exit(0);

        }
        System.out.println(days[number-1]);










    }
}
