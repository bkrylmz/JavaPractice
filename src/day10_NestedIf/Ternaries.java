package day10_NestedIf;


    public class Ternaries {
        public static void main(String[] args) {
            int n = 100;
         if(n%2 == 0){
             System.out.println("Even");
         }else {
             System.out.println("Odd");
         }
            System.out.println("------------------------");
           String result1 = (n%2 == 0)?"Even" : "Odd";

            System.out.println(result1);
            System.out.println("------------------------");
            int age = 23;
            if(age >= 21){
                System.out.println("Eligible");}else {
                    System.out.println("Not Eligible");
                }
            String result2 = (age >= 21) ? "Eligible" : "Not Eligible";
            System.out.println(result2);
            System.out.println("------------------------");
            int number = 0;
            if (number > 0){
                System.out.println("positive");
            }else if (number < 0) {
                System.out.println("negative");
            } else {
                System.out.println("zero");
            }
           String result3 =  (number > 0) ? "positive" : (number < 0)? "negative" : "zero";
            System.out.println(result3);



    }
}
