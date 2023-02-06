# Numeric Type Conversions 
Floating-Point numbers can be converted into integers using explicit casting.

Casting is an operation that converts a value of one data type into a value
of another data type. Java will automatically widen a type, but you must
narrow a type explicitly.

```
   public static void salesTax(){
       Scanner input = new Scanner(System.in);

       System.out.println("Enter purchase amount: ");
       double purchaseAmount = input.nextDouble();

       //casting
       double tax = purchaseAmount * 0.06;
       System.out.println("Sales tax is $" + (int) (tax * 100) / 100.0);
   }
```