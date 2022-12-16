package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name :");
        String fullName = scan.nextLine();
        System.out.println("Enter your building number: ");
        String buildingNumber = scan.nextLine();
        System.out.println("Enter your street name: ");
        String streetName = scan.nextLine();
        System.out.println("Enter your city name: ");
        String cityName= scan.nextLine();
        System.out.println("Enter your state name: ");
        String stateName = scan.nextLine();
        System.out.println("Enter your zip code: ");
        int zipCode = scan.nextInt();
        scan.nextLine();
        System.out.println(fullName + "\n" + "building number: " + buildingNumber + " "+ streetName +" Street "+ stateName+ " " + zipCode);











    }
}
