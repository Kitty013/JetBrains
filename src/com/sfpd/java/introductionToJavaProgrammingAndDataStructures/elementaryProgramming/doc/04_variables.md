# Variables
Variables are used to represent values that may be changed in the program.

Variables can be used to store values to be used later in a program.
They are called variables because their values can be changed.

The syntax for declaring a variable is:
>  Datatype variableName;

```
    public static void variables() {
        // Declaring variables
        double radius;        // declare radius to be a double variable
        double area;

        // Other examples of declarations
        int count;            // declare count to be an integer variable
        double interestRate;  // declare interestRate to be a double variable

        // If variables are of the same type, they can be declared together, separated by commas, as follows:
        // datatype variable1, variable2, ..., variablen;
        int i, j, k; // declare i, j and k as int variables

        // you can declare a variable and initialize it in one step
        int number = 1;
        // this is the equivalent tot the next two statements:
        // int number;
        // count = 1;

        // Use a shorthand form to declare and initialize variables of the same type together
        int z = 1, p = 2;

        // Compute the first area
        radius = 1.0;
        area = radius * radius * 3.14159;
        System.out.println("The area is " + area + " for radius " + radius);

        // Compute the second area
        radius = 2.0;
        area = radius * radius * 3.14159;
        System.out.println("The area is " + area + " for radius " + radius);
    }
```
