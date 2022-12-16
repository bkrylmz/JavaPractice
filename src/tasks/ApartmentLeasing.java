package tasks;

import java.util.Scanner;

public class ApartmentLeasing {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String result = "";
        System.out.println("Welcome to Cydeo Apartments!\n" +
                "How many bedrooms are you looking for?\n");
        int numberOfBedroom = scan.nextInt();
        if (numberOfBedroom <= 3) {
            switch (numberOfBedroom) {
                case 1:
                   result = "One Bedroom Selected.\nStarting Price: 1100";
                   break;
                case 2:
                    result = "Two Bedroom Selected.\nStarting Price: 1850";
                    break;
                case 3 :
                    result = "Three Bedroom Selected.\nStarting Price: 2250";
            }
        }else {
            System.out.println("Sorry, we do not offer that many bedrooms");
        }

        System.out.println(result);


        /*
        Use `if statements` to find the cost of leasing an apartment based on the number of bedrooms. Use the `numberOfBedrooms` variable and these rates to get the final price:

> - 1 bedroom: 1100
> - 2 bedroom: 1850
> - 3 bedroom: 2550

#### Note: If an invalid bedroom number is given no price is displayed

#### Note: Can use multiple if statements or a multi branch if statement

Main topics: if statements, primitive variables, concatenation, operators

**Example Flows:**
```
Welcome to Cydeo Apartments!
How many bedrooms are you looking for?
1
One Bedroom Selected
Starting Price: 1100
```

```
Welcome to Cydeo Apartments!
How many bedrooms are you looking for?
3
Three Bedroom Selected
Starting Price: 2550
```

```
Welcome to Cydeo Apartments!
How many bedrooms are you looking for?
5
Sorry, we do not offer that many bedrooms

         */






    }
}
