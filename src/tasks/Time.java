package tasks;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hour: ");
        int hour = scan.nextInt();
        System.out.println("Enter minute: ");
        int minute = scan.nextInt();
        System.out.println("Enter second: ");
        int second = scan.nextInt();
        System.out.println("AM OR PM");
        String amOrPm= scan.next();
        System.out.println(hour +":"+minute+ ":"+second + " "+amOrPm);

        /*
          For example it will be something like this:
    12:24:33 PM
```


1. In the beginning of the code, declare three `int` variables: `hour, minute, second` and declare a `String` variable: `amOrPm`.
> You only need to declare, no assignment.

2. In the middle of the code, the variables will be assigned a value using Scanner.
> Do not touch anything in this section.

3. In the end of the code, use the variables to put together and print the time of the day using the following format:

  ```
  hours:minutes:seconds amOrPm
  ```
         */
    }
}
