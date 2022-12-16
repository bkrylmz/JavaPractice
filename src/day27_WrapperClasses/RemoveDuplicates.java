package day27_WrapperClasses;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,2,3,3,3,3,3,3,4,4,4,4,4};

        arr = removeDuplicates(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------------------");

        String[] words = {"Java", "Java", "Python", "C#", "Java", "Java"};

        words = ArraysUtility.removeDuplicates(words);

        System.out.println(Arrays.toString(words));





    }
    //remove the duplicates from the given
    public static int[] removeDuplicates(int[] array){

        int[] result = {};

        for (int each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }








}
