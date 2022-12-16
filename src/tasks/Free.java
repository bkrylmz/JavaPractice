package tasks;

import java.util.Scanner;

public class Free {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        if(n1>n2 && n1<n3){
            System.out.println(n1 + " middle number");
        }else if (n2>n1 && n2<n3){
            System.out.println(n2 + " middle number");
        }else{
            System.out.println(n3 +" middle number");
        }

            /*### Using `if statements` and `Scanner` write a program that will read three number inputs. Then using those number determine which number is the middle number. Follow the exact flow from the examples below.

```
Hint:

1. Create an object of Scanner class.
2. Declare int 3 variables
3. Use Scanner to assign numbers from console into the variables
4. Use if statements to find the middle number
```

Main topics: if statements, primitive variables, operators, Scanner


**Example Flows:**

```
Enter first number:
14
Enter second number:
52
Enter third number:
25

middle number is: 25
```
```

Enter first number:
140
Enter second number:
34
Enter third number:
1
middle number is: 34*/
    }

}
