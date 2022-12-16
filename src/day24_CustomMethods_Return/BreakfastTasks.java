package day24_CustomMethods_Return;

import org.w3c.dom.ls.LSOutput;

public class BreakfastTasks {
    public static void main(String[] args) {

        initials("Safiye", "Yılmaz");

    }
    public static void initials (String firstname, String lastName){
        String initial = firstname.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);

    }







}
