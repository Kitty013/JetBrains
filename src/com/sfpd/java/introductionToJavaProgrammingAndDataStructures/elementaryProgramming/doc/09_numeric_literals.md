# Numeric Literals 
A literal is a constant value that appears directly in a program.

## integer literals
An integer literal can be assigned to an integer variable as long as it can fit into the variable.
```
         int numberOfYears = 34;
         double weight = 0.305;
```

## floating point literals
A Floating-Point Literals is treated as a double type value. You can make a number a float
by appending the letter f or F, and you can make a double by appending the letter d or D.

```
    public static void floatingPointLiterals() {
        // double vs float

        // The double type values are more accurate than the float type values.

        System.out.println("1.0 / 3.0 is " + 1.0 / 3.0);    // displays 16 digits

        System.out.println("1.0F / 3.0F is " + 1.0F / 3.0F);// displays 8 digits
    }
```
## scientific notation
Floating-Point literals can be written in scientific notation in the form of a x 10b.