package TaskDay20;

import java.util.Arrays;

public class clasmateInitials {
    public static void main(String[] args) {
//1. create an array named classmates, and store 10 of your classmates' full names
//            print the initials of each classmates in separate lines


        String[] classmates = {"Ali Al", "Veli Al", "Ahmet Yıldız", "Bora Bulanık", "Cengiz Satılmış","Yaver Yalı"};
        String initials = "";

        for (int i = 0; i < classmates.length ; i++) {

           initials = classmates[i].charAt(0) + "."+ classmates[i].charAt(classmates[i].indexOf(" ") +1);

            System.out.println(initials);


        }


    }

}
