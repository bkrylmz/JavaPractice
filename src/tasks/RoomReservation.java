package tasks;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        /*
        write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve.
    	if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to
    			reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to reserve a room? Yes / No");
        String reserve = scan.next();
        while (!(reserve.equalsIgnoreCase("yes")&&reserve.equalsIgnoreCase("no"))){
            System.out.println("Please reenter a valid entry");
            scan.next();
        }

        if(reserve.equalsIgnoreCase("no")){
            System.out.println("Have a nice day");
        } else if (reserve.equalsIgnoreCase("yes")) {
            System.out.println("which type of room do you want to reserve?");
            String roomTypes= scan.nextLine();
            if(roomTypes.equalsIgnoreCase("king bed")){
                System.out.println("King bed price is $120");
            }else if (roomTypes.equalsIgnoreCase("queen bed")){
                System.out.println("Queen bed price is $100");
            }else if (roomTypes.equalsIgnoreCase("single bed")){
                System.out.println("Single bed price is $80");
            }
            while(!((roomTypes.equalsIgnoreCase("queen bed")||roomTypes.equalsIgnoreCase("king bed")||
                    roomTypes.equalsIgnoreCase("single bed")))){
                System.out.println("Please, reenter a valid entry");
            }
        }
        System.out.println("----------------------------------");
        int i = 1;
        while (i < 10)
            if (i % 2 == 0)
                System.out.println(i++);


    }
}
