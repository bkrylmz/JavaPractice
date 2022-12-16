package Loops;

public class LoopsIntro {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.print("Hello World ");
        }
        int count = 0;
        while (count < 100){
            System.out.println("Welcome to Java");
            count++;

        }

        System.out.println("-------------------------");

        int sum = 0, i = 1;
        while (i < 10) {
            sum = sum + i;
            i++;
        }
        System.out.println("sum is " + sum);






    }
}
