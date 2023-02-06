# Software Development Process 
The software development life cycle is a multistage process that includes requirements
specification, analysis, design, implementation, testing, deployment, and maintenance.

Requirements specification is a formal process that seeks to understand the problem the
software will adress, and to document in detail what the software system needs to do.

System analysis seeks to analyze the data flow and to identify the system's input and output.

System design is to design a process for obtaining the output from the input.

The essence of the system analysis and design is input, process and output (IPO).

Implementation involves translating the system design into programs.

Testing ensures the code meets the requirements specification and weeds out bugs.

Deployment makes the software available for use.

Maintenance is concerned with updating and improving the product.

```
    public static void computeLoan(){
        // Write the program with the following requirements:
        // - It must let the user enter the interest rate, the loan amount, and the number of years
        //   for which payments will be made.
        // - It must compute and display the monthly payment and total payment amounts.

            // create a Scanner
            Scanner input = new Scanner(System.in);

            // Enter annual interest rate in percentage
            System.out.println("Enter annual interest rate, 7,25: ");
            double annualInterestRate = input.nextDouble();

            // Obtain monthly interest rate
            double monthlyInterestRate = annualInterestRate / 1200;

            // Enter number of years
            System.out.println("Enter number of years as an integer: ");
            int numberOfYears = input.nextInt();

            // Enter loan amount
            System.out.println("Enter loan amount: ");
            double loanAmount = input.nextDouble();

            // Calculate payment
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            double totalPayment = monthlyPayment * numberOfYears * 12;

            // Display results
            System.out.println("The monthly payment is $" + (int) (monthlyPayment * 100) / 100.0);
            System.out.println("The total payment is $" + (int) (totalPayment * 100) / 100.0);
    }
```
This section presents a program that breaks a large amount of money into smaller units.

```
    public static void computeChange(){
        // 1. Prompt the user to enter the amount as a decimal number, such as 11,56
        // 2. Convert the amount (11,56) into cents (1156)
        // 3. Divide the cents by 100 to find the number of dollars. Obtain the remaining cents using the cents remainder 100.
        // 4. Divide the remaining cents by 25 to find the number of quarters. Obtain the remaining cents cents using the remaining cents remainder 100.
        // 5. Divide the remaining cents by 10 to find the number of dimes. Obtain the remaining cents using the remainging cents remainder 10.
        // 6. Divide the rmaining cents by 5 to find the number of nickels. Obtain the remaining cents using the remaining cents remainder 5.
        //7. The remaining cents are the pennies.
        // 8. Display the result.

        // Create a scanner
        Scanner input = new Scanner(System.in);
        // Receive the amount
        System.out.println("Enter the amount, for example 11,56: ");
        double amount = input.nextDouble();
        int remainingAmount = (int)(amount * 100);
        // Find the number of one dollars
        int numberOfDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        // Find the number of quarters in the remaining amount.
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        // Find the number of dimes in the remaining amount.
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        // Find the number of nickels in the remaining amount.
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        // Find the number of pennies in the remaining amount.
        int numberOfPennies = remainingAmount;
        // Display the result
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }
```
