package day24_CustomMethods_Return;

public class ReturnMethodPractice2 {
    public static void main(String[] args) {
        String str = grade(95);
        System.out.println(str);

    }

    public static String grade(int score) {
        String result = "";
        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                result = "Excelent";
            } else if (score >= 80) {
                result = "Great";
            } else if (score >= 70) {
                result = "Good";
            } else if (score >= 60) {
                result = "Passed";
            } else {
                result = "Failed";
            }
        } else {
            result = "Invalid score";
        }
        return result;

    }






    
}
