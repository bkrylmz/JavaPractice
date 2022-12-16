package TaskDay20;

public class StudentGrade {
    public static void main(String[] args) {
        //4. given the following arrays:
        //		     	String [] names = {"Anna", "Nancy", "Sarah"};
        //		        int [] scores = {90, 75, 80};
        //		        char [] grades = new char[names.length];
        //
        //         1. write a program that can store the grades of the students in the array named grades
        //         2. print the grade report of each students in separate lines
        //         		Ex:
        //         			Anna's score is 90, and grade is A

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {75, 95, 60};
        char [] grades = new char[names.length];
        grades[0]='A';
        grades[1]='B';
        grades[2]='C';


        String enames="";
        int escores=0;
        char egrades=' ';

        for (int i = 0; i < names.length; i++) {
            enames = names[i];
            escores = scores[i];
            egrades = grades[i];
            System.out.println(enames+"'s score is "+ escores+", and grade is " + egrades);


        }


    }
}
