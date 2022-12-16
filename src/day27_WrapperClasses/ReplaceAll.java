package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 30, 40, 30, 30,30};

        arr = replaceAll(arr, 30, 300);

        System.out.println(Arrays.toString(arr));




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

}
