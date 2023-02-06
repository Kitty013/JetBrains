package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.selections.src;

import java.util.Scanner;

public class LeapYear {
    // A year is a leap year if it is divisible by 4 but not by 100, of if it is divisible by 400.
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);
        // Ask for input from the user
        System.out.println("Enter a year: ");
        int year = input.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0));

        // Display the result
        System.out.println(year + " is a leap year? " + isLeapYear);
    }
}
