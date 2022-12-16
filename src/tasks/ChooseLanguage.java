package tasks;

import org.w3c.dom.ls.LSOutput;

public class ChooseLanguage {
    public static void main(String[] args) {

        /*
        Create a class called ChooseLanguage, Given an integer variable named
selection that has a number between 1~5, Write a program that can
select the language based on the number that's given in selection and
prints the following message:
for 1: Hello, thank for your call
for 2: Hola, gracias para llamar
for 3: Merhaba, aradiginiz icin tesekkurler
for 4: Privet, spasibo za vash zvonok
for 5: Merci ,pour votre appel
         */
        int num = 5;
        String result = "";
        if( num >= 1 && num<=5){
            if (num == 1){
                result = "Hello, thank for your call";
            } else if (num==2) {
                result = "Hola, gracias para llamar";}
            else if (num == 3) {
                result = "Merhaba, aradiginiz icin tesekkurler";} else if (num == 4)
                {result = "Privet, spasibo za vash zvonok";}
            else {result = "Merci ,pour votre appel";}}
            else { result = "invalid";}
        System.out.println(result);

        System.out.println("--------------------------------");

        int num2 = 3;
        switch (num2){
            case 1:
                System.out.println("Hello, thank for your call");
                break;
            case 2:
                System.out.println("Hola, gracias para llamar");
                break;
            case 3:
                System.out.println("Merhaba, aradiginiz icin tesekkurler");
                break;
            case 4:
                System.out.println("Privet, spasibo za vash zvonok");
                break;
            case 5:
                System.out.println("Merci ,pour votre appel");
                break;
            default:
                System.out.println("invalid");

        }














    }
}
