package day11_Switch_Statement;

public class NumbersToWords {
    public static void main(String[] args) {
        int number = 7;

            String result1 = number >= 0 && number <= 9 ? number == 0 ? "Zero" : number == 1 ? "One" :
                    number == 2 ? "Two" : number == 4 ? "Four" :
                            number == 6 ? "Six" : number == 7 ? "Seven":
                number == 8 ? "Eight" : "Nine" : "Invalid Number";

        System.out.println(result1);







    }
}
