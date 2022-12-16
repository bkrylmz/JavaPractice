package Utilities;

import java.util.Arrays;

public class ArraysUtility {
    //adds an integer
    public static int[] addElement (int[]array, int element){
        int[] result = new int [array.length + 1];

        int i = 0;

        for (int each : array) {
            result[i++] = each;

        }
        result [i] = element;

        return result;
    }

    //adds a double
    public static double[] addElement (double[]array, double element){
        double[] result = new double [array.length + 1];

        int i = 0;

        for (double each : array) {
            result[i++] = each;

        }
        result [i] = element;

        return result;
    }

    //adds a char
    public static char[] addElement (char[]array, char element){
        char[] result = new char [array.length + 1];

        int i = 0;

        for (char each : array) {
            result[i++] = each;

        }
        result [i] = element;

        return result;
    }

    //adds a string
    public static String[] addElement (String[]array, String element){
        String[] result = new String[array.length + 1];

        int i = 0;

        for (String each : array) {
            result[i++] = each;

        }
        result [i] = element;

        return result;
    }

    //prints each integer of an integer array in seperate Lines
    public static void printEach (int[] array){
        for (int each : array) {
            System.out.println(each);
        }
    }

    //prints each double of a double array in seperate Lines
    public static void printEach (double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }

    //prints each char of a char array in seperate Lines
    public static void printEach (char [] array){
        for (char each : array) {
            System.out.println(each);
        }
    }

    //prints each String of a string array in seperate Lines
    public static void printEach (String [] array){
        for (String each : array) {
            System.out.println(each);
        }
    }

    //returns the maximum number for integer array
    public static int max (int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];

    }

    //returns the maximum number for double array
    public static double max (double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];

    }

    //returns the minumum number for integer array
    public static int min (int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    //returns the minumum number for double array
    public static double min (double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];

    }

    //checks if the given integer is contained int the given array. return boolean. contains(int[], int)
    public static boolean contains (int[] array, int element){
        boolean result = false;
        for (int each : array) {
            if(each == element ){
                result = true;
            }
        }
        return result;
    }

    //checks if the given double is contained int the given array. return boolean. contains(int[], int)
    public static boolean contains (double[] array, double element){
        boolean result = false;
        for (double each : array) {
            if(each == element ){
                result = true;
            }
        }
        return result;
    }

    //checks if the given char is contained int the given array. return boolean. contains(int[], int)
    public static boolean contains (char[] array, char element){
        boolean result = false;
        for (char each : array) {
            if(each == element ){
                result = true;
            }
        }
        return result;
    }

    //checks if the given String is contained int the given array. return boolean. contains(int[], int)
    public static boolean contains (String [] array, String element){
        boolean result = false;
        for (String each : array) {
            if(each == element ){
                result = true;
            }
        }
        return result;
    }

    //returns the fequency of the given element from the given array
    public static int frequencyOfElement (int[] array, int element){
        int count = 0;
        for (int each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }

    //returns the fequency of the given element from the given array
    public static int frequencyOfElement (double[] array, double element){
        int count = 0;
        for (double each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }

    //returns the fequency of the given element from the given array
    public static int frequencyOfElement (char[] array, char element){
        int count = 0;
        for (char each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }

    //returns the fequency of the given element from the given array
    public static int frequencyOfElement (String [] array, String element){
        int count = 0;
        for (String each : array) {
            if(each.equals( element)){
                count++;
            }
        }
        return count;
    }

    //returns the integer unique element of the array as a new array
    public static int[] uniqueElements(int[] array){
        int[] result = {};
        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)== 1){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns the double unique element of the array as a new array
    public static double[] uniqueElements(double[] array){
        double[] result = {};
        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)== 1){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns the char unique element of the array as a new array
    public static char[] uniqueElements(char[] array){
        char[] result = {};
        for (char each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)== 1){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns the string unique element of the array as a new array
    public static String[] uniqueElements(String[] array){
        String[] result = {};
        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)== 1){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //removes the index from the array, returns new array
    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        int[] result = new int[array.length - 1]; //1,2

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    //removes the index from the array, returns new array
    public static double[] removeElement(double[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        double[] result = new double[array.length - 1]; //1,2

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    //removes the index from the array, returns new array
    public static char[] removeElement(char[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        char[] result = new char[array.length - 1]; //1,2

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    //removes the index from the array, returns new array
    public static String[] removeElement(String[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        String[] result = new String[array.length - 1]; //1,2

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }
    
    //merge the given two arrays and returns the new array
    public static int[] merge(int[]arr1, int[] arr2){
        int[] result = new int[arr1.length+arr2.length];

        int i = 0;
        for (int each : arr1) {
           result[i++] = each;
        }
        for (int each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static double[] merge(double[]arr1, double[] arr2){
        double[] result = new double[arr1.length+arr2.length];

        int i = 0;
        for (double each : arr1) {
            result[i++] = each;
        }
        for (double each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static char[] merge(char[]arr1, char[] arr2){
        char[] result = new char[arr1.length+arr2.length];

        int i = 0;
        for (char each : arr1) {
            result[i++] = each;
        }
        for (char each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static String[] merge(String[]arr1, String[] arr2){
        String[] result = new String[arr1.length+arr2.length];

        int i = 0;
        for (String each : arr1) {
            result[i++] = each;
        }
        for (String each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    //reverses the given array, returns a new array
    public static int[] reverse(int[] array){
        int[] result = new int[array.length];
        int j= 0;
        for (int i = array.length - 1;  i >= 0; i--) {
            result [j]= array[i];
        }
        return result;
    }

    //reverses the given array, returns a new array
    public static double[] reverse(double[] array){
        double[] result = new double[array.length];
        int j = 0;
        for (int  i = array.length - 1;  i >= 0; i--) {
            result [j]= array[i];
        }
        return result;
    }

    //reverses the given array, returns a new array
    public static char[] reverse(char[] array){
        char[] result = new char[array.length];
        int j = 0;
        for (int  i = array.length - 1;  i >= 0; i--) {
            result [j]= array[i];
        }
        return result;
    }

    //reverses the given array, returns a new array
    public static String[] reverse(String[] array){
        String[] result = new String[array.length];
        int j = 0;
        for (int  i = array.length - 1;  i >= 0; i--) {
            result [j]= array[i];
        }
        return result;
    }

    //replace the elements of the array at given index with the new array
    public static int [] replace(int[] array, int index, int newElement){

        if (index < 0 ||index >array.length-1) {
            System.err.println("Invalid Index" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replace the elements of the array at given index with the new array
    public static double [] replace(double[] array, int index, double newElement){

        if (index < 0 ||index >array.length-1) {
            System.err.println("Invalid Index" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replace the elements of the array at given index with the new array
    public static char [] replace(char[] array, int index, char newElement){

        if (index < 0 ||index >array.length-1) {
            System.err.println("Invalid Index" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replace the elements of the array at given index with the new array
    public static String [] replace(String[] array, int index, String newElement){

        if (index < 0 ||index >array.length-1) {
            System.err.println("Invalid Index" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replaces all the matching old volues of the array with the new array
    public static int[] replaceAll(int[] array, int oldValue, int newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }

    //replaces all the matching old volues of the array with the new array
    public static double[] replaceAll(double[] array, double oldValue, double newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }

    //replaces all the matching old volues of the array with the new array
    public static char[] replaceAll(char[] array, char oldValue, char newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }

    //replaces all the matching old volues of the array with the new array
    public static String[] replaceAll(String[] array, String oldValue, String newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)) {
                array[i] = newValue;
            }
        }
        return array;
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

    //remove the duplicates from the given
    public static double[] removeDuplicates(double[] array){

        double[] result = {};

        for (double each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //remove the duplicates from the given
    public static char[] removeDuplicates(char[] array){

        char[] result = {};

        for (char each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //remove the duplicates from the given
    public static String[] removeDuplicates(String[] array){

        String[] result = {};

        for (String each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static boolean isStrongPassword(String Password){
        String password = "Cydeo1990@";
        boolean r1 = password.length()>=8 && !password.contains(" ");// has at least 8 char and has not " "
        boolean r2 = false; // has upper case
        boolean r3 = false; // has lower case
        boolean r4 = false; // has special char
        boolean r5 = false; // has digit

        char[] chars = password.toCharArray();
        for (char each : chars) {
            if(Character.isUpperCase(each)){
                r2 = true;
            }
            else if(Character.isLowerCase(each)){
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            }else {
                r4 = true;
            }
        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;

    }






















}
