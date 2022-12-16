package tasks.day23;

import javax.swing.plaf.PanelUI;
import java.util.Arrays;

public class Methods {



    //create a method that can print odd numbers between 1~100 in a same line saperated by space
    public static void evenNumber (int number){
        if (number %2 == 0) {
            System.out.println(number+ " is an even number");
        }else{
            System.out.println(number+ " is not an even number");
        }
    }

    //create a method that can print even numbers between 1~100 in a same line saperated by space

    public static void evenNumbersOneToHundred (){
        for (int i = 1; i <= 100 ; i++) {
            if (i %2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //create a method that can check if a person is eligible to buy alcohol

    public static void eligibleForAlcohol(int age){
        if (age >= 0) {
            System.out.println(" is eligible");
        }else{
            System.out.println(" is not eligible");
        }
    }

    //create a method named printEachElement that can print each elements of an integer array

    public static void printEachElement (int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    //create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result

    public static int calc(int num1, int num2, char mathOperator){
        int result = 0;
        if (mathOperator == '+') {
            result = num1 + num2;
        } else if (mathOperator == '-') {
            result = num1-num2;
        } else if (mathOperator == '*') {
            result = num1*num2;
        }else if (mathOperator == '/') {
            result = num1/num2;
    }else {
            System.err.println("invalid operator");
            System.exit(0);
        }
        System.out.println(result);
        return result;
    }

    /*
     write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"
     */
    public static void regularFormat(String name, String lastname){
        String firstName = name.substring(0, 1).toUpperCase()+ name.substring(1).toLowerCase();
        String lastName = lastname.substring(0,1).toUpperCase()+ lastname.substring(1).toLowerCase();
        String fullName = firstName + " "+ lastName;
        System.out.println(fullName);
    }




}
