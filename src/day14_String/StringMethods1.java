package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
        String  str1 = "          batch 25        ";
        str1 = str1.trim();
        System.out.println("str1 = " + str1);
        System.out.println("--------------------");
        String str2 = "Cydeo School";
       int n1 =  str2.indexOf("ool");
        System.out.println(n1);
        String str3= "Java Programming Language";
        int n2 = str3.indexOf("a ");
        System.out.println("n2 = " + n2);
        int n3 = str3.lastIndexOf("g");
        System.out.println("n3 = " + n3);
        System.out.println("-----------------");

        String s = "Java Nova Cava Wawa orange";
        int firstA = s.indexOf("a");
        System.out.println(firstA);
        int lastA = s.lastIndexOf("a");
        System.out.println(lastA);
        
        int secondA = s.indexOf("a ");
        System.out.println("secondA = " + secondA);
        int thirdA = s.indexOf("ava W");
        System.out.println("thirdA = " + thirdA);

        int forthA = s.indexOf("ava W");
        System.out.println("forthA = " + forthA);

        int fourthA = s.lastIndexOf("av");
        System.out.println("fourthA = " + fourthA);




    }
}
