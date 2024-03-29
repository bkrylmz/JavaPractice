package tasks;

import day07_Operators.ShorthandOperators;

import java.util.Scanner;

public class PatientInformation {
    public static void main(String[] args) {
        System.out.println("Welcome to the patient portal!\n" +
                "Please enter your personal information");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name");
        String lastName = scan.nextLine();
        System.out.println("Enter your email");
        String email = scan.nextLine();
        System.out.println("Enter your street");
        String street = scan.nextLine();
        System.out.println("Enter your city");
        String city = scan.nextLine();
        System.out.println("Enter your state");
        String state = scan.nextLine();
        System.out.println("Enter your zipCode");
        int zipCode = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();
        scan.nextLine();
        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();
        scan.nextLine();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your height");
        double height = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        scan.nextLine();
        System.out.println("Are you maried?");
        boolean isMaried = scan.nextBoolean();
        scan.nextLine();
        System.out.println("Patient personal information");
        System.out.println("Full name : " + firstName + " "+ lastName);
        System.out.println("Adress : "+ street + " " + state + " " + city + " " + zipCode);
        System.out.println("Work phone number : " + workPhoneNumber+ ", personal phone number : "+
                personalPhoneNumber + "email: " + email);
        System.out.println("Age: "+ age);
        System.out.println("Height: " + height);
        System.out.println("Weihgt: " + weight + " pounds");
        System.out.println("isMaried = " + isMaried);
       /* Patient personal information
        Full name: James May
        Address: 7925 Jones Branch Dr, McLean, VA 22102
        Contact: work phone number: 7896542314, personal phone number: 2406542314, email: jamesmay@gmail.com
        Age: 35
        Height: 5.1
        Weight: 173.2 pounds
        Married: true*/




       /* Declare nine `String` variables: `firstName`, `lastName`, `email`, `street`, `state`, `city`

        - Declare two `int` variables: `age`, `zipCode`

        - Declare two `double` variables: `height`, `weight`

        - Declare a `boolean` variable: `isMarried`

        - Declare two `long` variables: `workPhoneNumber` ,`personalPhoneNumber`

        - Create a `Scanner` object named `scan`*/




        /*
        ### This program will use Scanner to get many inputs about a patient and use that information to build a summary.

- Declare nine `String` variables: `firstName`, `lastName`, `email`, `street`, `state`, `city`

- Declare two `int` variables: `age`, `zipCode`

- Declare two `double` variables: `height`, `weight`

- Declare a `boolean` variable: `isMarried`

- Declare two `long` variables: `workPhoneNumber` ,`personalPhoneNumber`

- Create a `Scanner` object named `scan`


#### Your program flow should go like this:
#### Note: anything indented is an input value from the console

```
Welcome to the patient portal!
Please enter your personal information
Enter your first name
  James
Enter your last name
  May
Enter your email
  jamesmay@gmail.com
Enter your street
  7925 Jones Branch Dr
Enter your city
  McLean
Enter your state
  VA
Enter your zip code
  22102
Enter your work phone number
  7896542314
Enter your personal phone number
  2406542314
Enter your age
  35
Enter your height
  5.10
Enter your weight
  173.2
Are you married?
  true
```

#### Take all the inputs from the above flow and combine these sections together

- Declare and assign a `contact` variable using these inputs: *work phone, personal phone and email*. Use a comma and a space to separate each value

- Declare and assign a `fullName` variable using these inputs: *first name and last name* Use a space to seperate each value

- Declare and assign an `address` variable using these inputs: *street, city, state, zip code* Use a comma and a space to separate each value

#### Display all of the information together as below

#### The final output of your program should be:
  > The first part of the outcome are the questions which are asked from the Scanner portion

```
Welcome to the patient portal!
Please enter your personal information
Enter your first name
Enter your last name
Enter your email
Enter your street
Enter your city
Enter your state
Enter your zip code
Enter your work phone number
Enter your personal phone number
Enter your age
Enter your height
Enter your weight
Are you married?

Patient personal information
Full name: James May
Address: 7925 Jones Branch Dr, McLean, VA 22102
Contact: work phone number: 7896542314, personal phone number: 2406542314, email: jamesmay@gmail.com
Age: 35
Height: 5.1
Weight: 173.2 pounds
Married: true
```

Main topics: variables, primitive datatypes, String, Scanner, concatenation
         */





    }
}
