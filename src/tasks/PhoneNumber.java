package tasks;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter area code: ");
        int areaCode= scan.nextInt();
        System.out.println("Enter local number: ");
        int localNumber = scan.nextInt();
        System.out.println("calling number (" + areaCode +")-"+localNumber);
        /*
        For example it will be something like this:
    (222)-3334444
```

1. Given two `int` variables `areaCode` and `localNumber` that are assigned a value from Scanner, combine them together into a phone number in the following format:

```
  (areaCode)-localNumber
```

Print this final message:
```
  Calling number $phoneNumber
```

```
Ex:

  Input:
    222
    3334444

  Output:
    Calling number (222)-3334444
         */
    }
}
