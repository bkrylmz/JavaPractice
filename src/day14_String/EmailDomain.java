package day14_String;

public class EmailDomain {
    public static void main(String[] args) {
        String email = "Cydeo.School@gmail.com";
        int beginningIndex = email.indexOf("@")+1;
        int endingIndex = email.lastIndexOf(".");
        String domain = email.substring(beginningIndex, endingIndex);
        System.out.println("domain = " + domain);

        System.out.println("------------------------------");

        String str1 = "Java is fun, Java is cool, I love Java";
        String s1 = str1.substring(0, str1.indexOf(","));
        String s2 = str1.substring (str1.indexOf(", ")+2, str1.lastIndexOf(", "));
        System.out.println("s1 = " + s1);

        System.out.println("s2 = " + s2);

        String s3 = str1.substring(str1.lastIndexOf("I"));
        System.out.println("s3 = " + s3);







    }
}
