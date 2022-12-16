package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 400;

        if(score >= 0 && score <= 100){
            if(score >= 60) {System.out.println("Passed");}
        else {
            System.out.println("Failed");
        }

        } else {
            System.out.println("Invalid score");
        }
        System.out.println("-------------------------------------");
        int age = 19;
        boolean hasId = false;

        if(hasId) {
            if (age >= 21) {
                System.out.println("Eligible to buy alcohol");
            } else {
                System.out.println("Not Eligible to buy alcohol");
            }
        }else {
            System.out.println("You must have an ID to buy alcohol");
        }
        System.out.println("---------------------------------------");
        int number = 7;
        if (number<=7 && number > 0){
            if (number == 1){
                System.out.println("Today is Monday");
            } else if (number == 2) {
                System.out.println("Today is Tuesday");}
            else if (number == 3) {
                System.out.println("Today is Wednesday");}
            else if (number == 4) {
                System.out.println("Today is Thursday");}
            else if (number == 5) {
                System.out.println("Today is Friday");}
            else if (number == 6) {
                System.out.println("Today is Saturday");}
            else {
                System.out.println("Today is Sunday");
            }

            } else {
            System.out.println("Invalid Number");
        }






    }
}
