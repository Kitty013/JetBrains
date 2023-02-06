package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.elementaryProgramming.src;

import java.util.Scanner;

public class MultiplyDigitsInAInteger {
    /** Write a program that reads an integer between 0 and 1000;
     *  Mulitplie all the digits in the integer
     *  Use the % operator to extract digits and use the / operator to remove the extracted digit.
     */
    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);
        // ask for input
        System.out.println("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        // do the calculation
        int hundreds = number / 100;
        int tiens = (number % 100) / 10;
        int units = (number % 10) / 1;
        // Multiply digits
        int result = hundreds * tiens * units;
        // Print results
        System.out.println("The multiplication of all digits in " + number + " is " + result);
    }
}
