# Evaluating Expressions And Operator Precedence 
Java expressions are evaluated in the same way as arithmetic expressions.
*	Multiplication, divison, and remainder operators are applied first.
*	Addition and substraction are applied last.
```
    public static void fahrenheitToCelsius(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius:
        double celsius = (5.0 / 9) * (fahrenheit - 32);     // divide
        System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
    }
```
You can invoke System.currentTimeMillis() to return the current time.

The currentTimeMillis method is the System class returns the current time in milliseconds 
elapsed since the time midnight, January 1, 1970 GMT.
```
    public static void showCurrentTime() {
        // Compute the current second, minute and hour

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliSeconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliSeconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        // Displays results
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
```
## augmented assignment operators
The operators +, -, *, /, and % can be combined with the assignment operator to form
augmented operators.

| OPERATOR | NAME                      | EXAMPLE | EQUIVALENT |
|----------|---------------------------|---------|------------|
| +=       | Addition assignment       | i += 8  | i = i + 8  |
| -=       | Subtraction assignment    | i -= 8  | i = i - 8  |
| *=       | Multiplication assignment | i *= 8  | i = i * 8  |
| /=       | Division assignment       | i /= 8  | i = i / 8  |
| %=       | Remainder assignment      | i %= 8  | i = i % 8  |
