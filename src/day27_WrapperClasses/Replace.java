package day27_WrapperClasses;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        replace(arr, 2, 30);

        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------------------");

        String[] arr2 = {"Java", "Python", "C++", "Ruby"};

        arr2 = ArraysUtility.replace(arr2, 2, "C#");

        System.out.println(Arrays.toString(arr2));




    }


    public static int [] replace(int[] array, int index, int newElement){

         if (index < 0 ||index >array.length-1) {
             System.err.println("Invalid Index" + index);
             System.exit(0);

         }

         array[index] = newElement;

         return array;

     }
}
