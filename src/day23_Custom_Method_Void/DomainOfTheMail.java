package day23_Custom_Method_Void;

public class DomainOfTheMail {
    public static void main(String[] args) {
        domain("safiyeyilmaz@yahoo.com");
        System.out.println("-------------------------");
        String[] emails = {"josh@gmail.com", "jim@yahoo.com", "Elninur@cydeo.com", "Gulsen@gmail.com"};

        for (String email : emails) {
            domain(email);
        }


    }



    public static void domain (String email){//cydeo@gmail.com
        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf(".") );
        System.out.println("domain = " + domain);

    }










}
