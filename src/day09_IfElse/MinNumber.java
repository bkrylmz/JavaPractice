package day09_IfElse;

public class MinNumber {
    public static void main(String[] args) {
        int num1 = 100,
                num2 = 200;
        boolean num1IsMin = num1 < num2;
        boolean num2IsMin = num2 > num1;
        boolean equal = num1 == num2;

        if(num1IsMin){
        } else {
            System.out.println(num1 + " is the minumum number");
        }

        if(num2IsMin){
            System.out.println(num2 + " is minumum number");

        }
        if(equal){
            System.out.println("Equal");
        }




    }
}
