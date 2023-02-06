# Writing a simple program 
Writing a program involves designing a strategy for solving the problem then using a
programming language to implement that strategy.

Let's first consider the simple problem of computing the area of a circle.
How do we write a program for solving this problem?
The algorithm for calculating the area of a circle can be described as follows:
  1) Read in the circle's radius
  2) Compute the area using the following formula:
            Area = radius * radius * Pi
  3) Display the result.

Java provides simple data types for representing integers, real numbers, characters, and
Boolean types. These are know as primitive data types. Numbers with a decimal point are
represented using a method known as floating-point. You can use the keyword double to
declare a floating-point variable.

A java program begins with a class defenition in which the keyword class is followed by the
class name.

Every java program must have a main method where program execution begins.
```
    public static void computeArea() {
        // In order to store the radius, the program needs to declare a symbol called a variable.
        // A variable represents a value stored in the computer's memory.
        // Choose descriptive names and specify their data types. This is know as declaring variables.
        double radius; // declare radius
        double area; // declare area

        // Step 1 : Designate the circle's radius using a fixed value
        radius = 20; // The radius is now 20

        // Step 2 : Compute area by assigning the result of the expression radius * radius * Pi to area
        area = radius * radius * 3.14159;

        // Step 3 : Display the area by using the system out println method
        System.out.println("The area for the circle of radiaus " + radius + " is " + area);
    }
```