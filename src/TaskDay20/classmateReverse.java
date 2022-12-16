package TaskDay20;

public class classmateReverse {
    public static void main(String[] args) {
//2. create string array, and store the names of your  class mates (10)
//            reverse each students names and print them in separate lines
//            	ex:
//            		arr = {java, python, c#}
//
//        		output:
//        			avaJ
//        			nohtyp
//        			#c

        String[] classmates = {"Ali Al", "Veli Al", "Ahmet Yıldız", "Bora Bulanık", "Cengiz Satılmış","Yaver Yalı"};
        String seperate = "";

        for (int i = 0; i < classmates.length; i++) {
            seperate = classmates[i];

            String reverseName = "";

            for (int j = seperate.length()-1; j >=0 ; j--) {

                reverseName += seperate.charAt(j);

            }
            System.out.println(reverseName);
        }



        }

    }

