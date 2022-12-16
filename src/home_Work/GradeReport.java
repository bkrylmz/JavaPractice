package home_Work;

public class GradeReport {
    public static void main(String[] args) {
        int score = 55;
        boolean A = score >= 90;
        boolean B = score >= 80 && score <= 89;
        boolean C = score >= 70 && score <= 79;
        boolean D = score >= 60 && score <= 69;
        boolean F = score <= 59;
        if (A){
            System.out.println("Excellent");
        } else if (B) {
            System.out.println( "Very Good");
        }else if (C) {
            System.out.println("Good");
        } else if (D) {
            System.out.println("Satisfactory");
        } else {
            System.out.println("Failed");
        }

        System.out.println(10/3);
        System.out.println();

        System.out.println(":)"+(1+3));


        long a = 10000000000l;
        byte b = (byte)a;
        System.out.println(b);

        System.out.println();
        float a1 = 100.9987698_766f;
        double b1 = (byte)a1;
        System.out.println(b1);



    }
}
