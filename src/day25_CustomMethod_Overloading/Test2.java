package day25_CustomMethod_Overloading;

import Utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};

        ArraysUtility.printEach(arr1);

        System.out.println("------------------------- ");

        double [] arr2 = {1.5, 2.5,3.5, 4.5 };

        ArraysUtility.printEach(arr2);

        System.out.println("---------------------------");

        char[] arr3 = {'A', 'B', 'C', 'D'};

        ArraysUtility.printEach(arr3);

        System.out.println("---------------------------");

        String [] arr4 = {"David", "Elvira", "Ali", "Igor"};

        ArraysUtility.printEach(arr4);

        System.out.println("---------------------------");

        int [] n1 = {10, 2, 3, 4, 5, 6 };

        int max1 = ArraysUtility.max(n1);

        System.out.println(max1);

        System.out.println("---------------------------");

        double [] n2 = {2.3, 4.5, 6.6, 7.8, 20,5};

        double max2 = ArraysUtility.max(n2);

        System.out.println(max2);

        System.out.println("---------------------------");

        int [] arr5 = {1,2,3,4,5,6,7};

        boolean r1 = ArraysUtility.contains(arr5, 5);


        System.out.println(r1);
















    }
}
