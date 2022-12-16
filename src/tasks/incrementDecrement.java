package tasks;

public class incrementDecrement {
    public static void main(String[] args) {

        int num = 9;
        int num2 = num++;



        if (num++ == 10) {
            System.out.println("ok");//true
        }

        if (num == 11){
            System.out.println("true");//true
        }

        if (num2++ == 9){

            System.out.println("allright");//true
        }

        if (num2++ == 10){

            System.out.println("allright2");//true
        }
        if(--num==10){
            System.out.println("right");//true
        }
        if(--num2==10){
            System.out.println("waw");//true
        }

    }
}
