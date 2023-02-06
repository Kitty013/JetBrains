# Common Errors And Pitfalls
Common elementary programming errors often involve underdeclared variables,
uninitialized variables, integer overflow, unintended integer division,
and round-off errors.

## common error 1: undeclared/uninitialized and unused variables
```
        Double interestRate = 0.05;
        Double interest = interestrate * 45;
```
     >  Interestrate has not been declared and initialized.

## common error 2: integer overflow
When a variable is assigned a value that is too large to be stored, it causes overflow.
When a floating-point number is too small to be stored, it causes underflow.

## common error 3: round off errors
Also called a rounding error, is the difference between the calculated approximation of a
number and its mathematical value.

## common error 4: unintented integer divison

## common pitfall 1: redundant input objects
```
  	Scanner input = new Scanner (System.in);
    System.out.println("Enter an integer: ");
    Int v1 = input.nextInt();
    
    Scanner input1 = new Scanner(System.in);    // BAD CODE
    System.out.println("Enter a double value: ");
    Double v2 = input1.nextDouble();
    
    Scanner input = new Scanner(System.in);      // GOOD CODE
    
    System.out.println("Enter an integer: ");
    Int v1 = input.nextInt();
    
    System.out.println("Enter a double value: ");
    Double v2 = input.nextDouble();
```
