package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.elementaryProgramming.src;

import java.util.Scanner;

public class FindNumberOfYears {
    /** Write a program that prompts the user to enter the minutes
     *  Display the number of years and remaining days for the minutes
     *  A year has 365 days
     */
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);
        // Ask for input
        System.out.println("Enter the number of minutes: ");
        int minutes = input.nextInt();
        // Calculate the number of years and remaining days
        int numberOfYears = minutes / 525600;
        int remainingDays = (minutes % 525600) / 1440;
        // Display result
        System.out.println(minutes + " minutes is approximately " + numberOfYears + " years and " + remainingDays + " days");
    }
}
