package day07_Operators;

public class ShorthandOperators {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("number = " + number); //100

        number = 200;
        System.out.println("number = " + number);//200
        System.out.println("-----------------------------------------------");

        String word = "Java Programming";
        System.out.println("word = " + word);//Java Programming
        word = "Wooden Spoon";
        System.out.println("word = " + word);//Wooden Spoon
        word = "Cydeo";
        System.out.println("word = " + word);//
        word = "123"+1;
        System.out.println("word = " + word);





        System.out.println("-----------------------------------------------");
        int x = 100;
        System.out.println("x = " + x);

        x += 200;
        System.out.println("x = " + x);

        String str = "Wooden";
        str += " Spoon";
        System.out.println("str = " + str);

        double num1 = 2.5;
        System.out.println("num1 = " + num1);
        num1 += 5.5;
        System.out.println("num1 = " + num1);

        System.out.println("-----------------------------------------------");
        double availableBalance = 1000.5;
        availableBalance -= 500;
        System.out.println("availableBalance = " + availableBalance);
       // withdraw =200, deposit = 400

        availableBalance -= 200;
        System.out.println("availableBalance = " + availableBalance);
        availableBalance += 400;
        System.out.println("availableBalance = " + availableBalance);

        System.out.println("-----------------------------------------------");
        double salary = 50000.5;
        salary *= 2;
        System.out.println("salary = " + salary);

        double dodge = 0.00000001;
        dodge *= 1000000;
        System.out.println("dodge = " + dodge);


        System.out.println("-----------------------------------------------");
        double num2 = 25000;
        num2 /= 2;
        System.out.println("num2 = " + num2);

        System.out.println("-----------------------------------------------");

        double num3 = 100;
        num3 %= 3;
        System.out.println("num3 = " + num3);

        System.out.println("-----------------------------------------------");
        int amount = 127;
        int quarters = amount /25;
        int cents = amount % 25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("-----------------------------------------------");
        int y = 300;
        y %= 16;
        System.out.println("y = " + y);
        System.out.println("-----------------------------------------------");
        
        int balance = 3500;
        balance %= 153;
        System.out.println("balance = " + balance);












    }







}
