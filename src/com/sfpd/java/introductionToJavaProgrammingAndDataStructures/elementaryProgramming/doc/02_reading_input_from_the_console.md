# Reading input from the console
Reading input from the console enables the program to accept input from the user.

To use a different radius, you have to modify the source code and recompile it.
Obiviously, this is not convenient, so instead you can use the Scanner class for console
input. The whole line creates a Scanner object and assigns its reference to the variable
input.
>   Scanner input = new Scanner(System.in);

Java uses System.out to refer to the standard output device, and System.in to the standard
input device.

```
import java.util.Scanner; // imports the java util class Scanner

    public static void computeAreaWithConsoleInput() {
        // Prompt the user to enter a radius
        // An object may invoke its methods.
        // To invoke a method on an object is to ask the object to perform a task.
        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble(); // This statement reads a number from the keyboard and assigns it to radius.

        // Compute area
        double area = radius * radius * 3.14159;

        // Display results
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
```    
```
import java.util.*; // wildcard import

    public static void computeAverage() {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three values:
        System.out.println("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        // Compute average
        double average = (number1 + number2 + number3) / 3;

        // Displays results
        System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);
    }
```
