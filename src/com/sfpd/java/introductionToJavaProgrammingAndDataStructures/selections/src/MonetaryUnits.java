package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.selections.src;

import java.util.Scanner;

public class MonetaryUnits {
    /* Modify ComputeChange to display the nonzero denominations only, using singular words for single units such as
    1 dollar and 1 penny, and plural words for more than one unit such as 2 dollars and 3 pennies.
     */
    public static void main(String[] args) {
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
}
