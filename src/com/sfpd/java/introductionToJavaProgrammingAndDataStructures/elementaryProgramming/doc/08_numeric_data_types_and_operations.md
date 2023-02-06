# Numeric Data Types And Operations 
Java has six numeric types for integers and floating-point numbers with operators + , - , * ,
/ , and %.

## numeric types
Eight primitive data types for numeric values, characters and Boolean values:
*  Java uses four types for integers: byte, short, int and long and two
*  types for floating-point numbers: float and double.

## reading numbers from the keyboard
You can also use the methods to read a number of the byte, short, int, long and float type.

| METHOD        | DESCRIPTION                         |
|---------------|-------------------------------------|
| nextByte()    | Reads an integer of the byte type   |
| nextShort()   | Reads an integer of the short type  |
| nextInt()     | Reads an integer of the int type    |
| nextLong()    | Reads an integer of the long type   |
| nextFloat()   | Reads an integer of the float type  |
|  nextDouble() | Reads an integer of the double type |

```
    public static void readingNumbersFromTheKeyboard() {
        // Here are examples for reading values of various types from the keyboard

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a byte value: ");
        byte byteValue = input.nextByte();

        System.out.println("Enter a short value: ");
        short shortValue = input.nextShort();

        System.out.println("Enter a int value: ");
        int intValue = input.nextInt();

        System.out.println("Enter a long value: ");
        long longValue = input.nextLong();

        System.out.println("Enter a float value: ");
        float floatValue = input.nextFloat();

        System.out.println("Enter a double value: ");
        double doubleValue = input.nextDouble();
    }
```
## numeric operators 

| NAME | MEANING        | EXAMPLE    | RESULT |
|------|----------------|------------|--------|
| +    | Addition       | 34 + 1     | 35     |
| -    | Substraction   | 24.0 - 0.1 | 33.9   |   
| *    | Multiplication | 300 * 30   | 9000   |  
| /    | Divison        | 1.0 / 2.0  | 0.5    | 
| %    | Remainder      | 20 % 3     | 2      |
```
    public static void displayTime() {
        Scanner input = new Scanner(System.in);                       // create a Scanner
        // Prompt the user for input
        System.out.println("Enter an integer for seconds: ");
        int seconds = input.nextInt();                                // read an integer

        int minutes = seconds / 60; // Find minutes in seconds        // divide
        int remainingSeconds = seconds % 60; // Seconds remaining     // remainder
        System.out.println(seconds + " seconds is " + minutes +
                " minutes and " + remainingSeconds + " seconds");
    }
```
## exponent operators
The Math.pow(a, b) method can be used to compute ab.
```
    public static void exponentOperators() {
        System.out.println(Math.pow(2, 3));                 // Displays 8.0
        System.out.println(Math.pow(4, 0.5));               // Displays 2.0
        System.out.println(Math.pow(2.5, 2));               // Displays 6.25
        System.out.println(Math.pow(2.5, -2));              // Displays 0.16

        // System.out.println("25 / 4 is " + 25/4);            // not correct
        System.out.println("25 / 4.0 is " + 25/4.0);           // correct
        // System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);    // not correct
        System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);   // correct
    }
```
