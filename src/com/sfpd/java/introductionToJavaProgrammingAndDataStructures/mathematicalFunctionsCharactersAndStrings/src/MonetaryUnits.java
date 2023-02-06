package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.mathematicalFunctionsCharactersAndStrings.src;

import java.util.Scanner;

public class MonetaryUnits {
    /*  Rewrite ComputeChange.java to fix the possible loss of accuracy when converting a float value to an int value.
        Read the input as a string such as "11.56". You program should extract the dollar amount before the decimal
        point, ant the cents after the decimal amount using the indexOf and substring methods.
    */
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);
        // Receive the amount
        System.out.println("Enter the amount, for example 11,56: ");
        String amount = input.next();
        int komma = Integer.parseInt(String.valueOf(amount.indexOf(",")));
        String remainingAmount = amount.substring(komma + 1);

        // Find the number of one dollars
        String numberOfDollars = amount.substring(0,komma);

        // Display the result
        System.out.println("Your amount consists of " + numberOfDollars + " dollars and " + remainingAmount + " cents.");
    }
}


