package day26_CustomMethodsPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6};

        int [] arr2 = {7, 8, 9, 10};

        int[] merged = ArraysUtility.merge(arr1, arr2);

        System.out.println(Arrays.toString(merged));






    }
}