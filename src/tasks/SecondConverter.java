package tasks;

import java.util.Scanner;

public class SecondConverter {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    if ( num1>num2){
        System.out.println(num1 + " is greater");
    } else {
        System.out.println(num2 + " is greater");
    }
}/*
    ### Use an `if statement` to determine if the given number `a` is greater than the other given number `b`. Print out which is the biggest in the following format:

#### $number is greater

#### Note: The two given numbers will not be equal

Main topics: if statements, primitive variables, concatenation, operators

```
Ex:
  Input:
    1
    2

  Output:
    2 is greater
```
```
Ex:
  Input:
    7
    4

  Output:
     */
}
