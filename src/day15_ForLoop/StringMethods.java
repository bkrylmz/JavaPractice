package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {
        String str = "   ";
        boolean r=  str.isEmpty();
        System.out.println("r = " + r);
        boolean r1 = str.isBlank();
        System.out.println("r1 = " + r1);
        System.out.println("--------------------");
        String s1 = "CYDEO";
        String s2 = "cydeo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("yES".equalsIgnoreCase("Yes"));
        System.out.println("---------------------------------");
        String sentence = "May favorite programming language is Java";
        boolean hasCSharp = sentence.contains("j");
        System.out.println("hasCSharp = " + hasCSharp);
        boolean has2 = sentence.toLowerCase().contains("java");
        System.out.println("has2 = " + has2);
        System.out.println("---------------------------------");
        String input1 = "I love Java";
        String input2 = "Java";
        boolean result = input1.equals(input2);
        System.out.println("result = " + result);
        boolean result2= input2.contains(input1);
        System.out.println("result2 = " + result2);








    }
}
