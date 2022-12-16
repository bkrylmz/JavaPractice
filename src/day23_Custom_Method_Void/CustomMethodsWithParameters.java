package day23_Custom_Method_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
        oddOrEven(52);
        ageOfPerson(1983);


    }

    public static void ageOfPerson (int birthYear){
        int age = 2022 - birthYear;
        System.out.println(age);
    }
    public static void oddOrEven (int number){
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }

    }
}
