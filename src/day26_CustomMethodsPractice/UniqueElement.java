package day26_CustomMethodsPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElement {
public static void main(String[]args){
        int[] array = {1,1,1,1,1,2,3,3,3,3,4,5,5,};
        int[] unique = uniqueElements(array);
    System.out.println(Arrays.toString(unique));

    double[] array2 = {1.5, 2.5, 1.5, 3.5, 4.5, 4.5, 5.5, 5.5};

    double [] unique2 = ArraysUtility.uniqueElements(array2);

    System.out.println(Arrays.toString(unique2));






        }





    public static int[] uniqueElements(int[] array){
        int[] result = {};
        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)== 1){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
}
