package day15_ForLoop;

public class ForLoopIntro {
    public static void main(String[] args) {

        for (int i = 15; i <= 45; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("--------------------------------");
        for (int i = 100; i > 49 ; i--) {
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println("---------------------------------");
        for (int i = 1; i < 16 ; i++) {
            if(i % 2 == 0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
        System.out.println("---------------------------------");
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("-------------------------------");
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            sum += i;

        }
        System.out.println(sum);



    }
}
