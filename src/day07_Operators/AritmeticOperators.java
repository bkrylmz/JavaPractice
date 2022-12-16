package day07_Operators;

public class AritmeticOperators {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 3;
        int division = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("division = " + division);//division variable contains the result of num1 divided by num2
        System.out.println("remainder = " + remainder);//remainder variable contains the remainder of num1 divided by num2
        System.out.println(num1 + " divided by " + num2 + " is equal to " + division + " with a remainder of " + remainder);
    }


}
