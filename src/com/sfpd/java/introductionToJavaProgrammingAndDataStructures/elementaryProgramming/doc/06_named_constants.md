# Named Constants
A named constant is an identifier that represents a permanent value.
 
It represents permanent data that never changes, also known as a final variable in Java.
Pi is a constant.

This is the syntax for declaring a constant:
>  Final datatype CONSTANTNAME = value;

``` 
import java.util.Scanner;
  
    public static void computeAreaWithConstant() {
        final double PI = 3.14159;    // Declare a constant

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius
        System.out.println("Enter a number for radius : ");
        double radius = input.nextDouble();

        // Compute area
        double area = radius * radius * PI;

        // Display result
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
```