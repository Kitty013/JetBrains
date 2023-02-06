package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.elementaryProgramming.src;

import java.util.Scanner;

public class CompoundValue {
    /** Write a program that prompts the user to enter a monthly saving amount
     *  The annual interest rate is 3.75%
     *  Monthly interest rate = 0.0375/12 = 0.003125
     *  1e month = 100 * ( 1 + 0.003125)
     *  2e month = (100 + 1e month) * ( 1 + 0.003125)
     *  3e month = (100 + 2e month) * ( 1 + 0.003125)
     *  Display the account value after six months
    */
     public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
        // Ask for input from user
        System.out.println("Enter a monthly saving amount: ");
        double monthlySavingAmount = input.nextDouble();
        // Calculate 1e month
        double monthlyInterestRate = 1 + 0.003125;
        double firstMonth = monthlySavingAmount * monthlyInterestRate;
        double secondMonth = (monthlySavingAmount + firstMonth) * monthlyInterestRate;
        double thirthMonth = (monthlySavingAmount + secondMonth) * monthlyInterestRate;
        double fourthMonth = (monthlySavingAmount + thirthMonth) * monthlyInterestRate;
        double fifthMonth = (monthlySavingAmount + fourthMonth) * monthlyInterestRate;
        double sixthMonth = (monthlySavingAmount + fifthMonth) * monthlyInterestRate;
        // Display the results
        System.out.println("Your savings the first month is " + firstMonth);
        System.out.println("Your savings the second month is " + secondMonth);
        System.out.println("Your savings the thirth month is " + thirthMonth);
        System.out.println("Your savings the fourth month is " + fourthMonth);
        System.out.println("Your savings the fifth month is " + fifthMonth);
        System.out.println("Your savings the sixst month is " + sixthMonth);
    }
}
