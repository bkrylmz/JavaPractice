package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1 = 25;
        int num = -25;
        int a = 25;
        System.out.println(++a); //pre increment : increases the value by 1 immediately
        System.out.println(--a);

        System.out.println("-------------------------------------");
        int b = 5;

        System.out.println(b++); //post increment: first passes the current value, then increases the value by 1
        System.out.println(b);
        System.out.println("----------------------------------------");

        int x = 200;
        System.out.println(--x);//pre-decrement: decreas the value by 1 right away

        int y = 200;
        System.out.println(y--); //post-decrement : first passes the current value, then decreases the value by 1.
        System.out.println("----------------------------------------");

        int z = 45;
        System.out.println(++z);
        System.out.println(z++);
        System.out.println(z);

        System.out.println("----------------------------------------");
         int q = 30;
        System.out.println(--q);
        System.out.println(q--);
        System.out.println(q);










    }








}
