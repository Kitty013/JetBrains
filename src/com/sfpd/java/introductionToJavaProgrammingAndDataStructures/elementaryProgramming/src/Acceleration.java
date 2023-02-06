package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.elementaryProgramming.src;

import java.util.Scanner;

public class Acceleration {
    /**
     * Average acceleration is defined as the change of velocity divided by
     * the time taken to make the change:
     * a = (v1 - v0) / t
     * Write a program that prompts the user to enter the starting velocity v0
     * in meters/second the ending velocity v1 in meters/second, and the
     * time span t in seconds. Display the average acceleration
     */
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
        // Ask for input from user
        System.out.println("Enter the starting velocity in meters/second: ");
        double startingVelocity = input.nextDouble();
        System.out.println("Enter the ending velocity in meters/second: ");
        double endingVelocity = input.nextDouble();
        System.out.println("Enter the time span in seconds: ");
        double timeSpan = input.nextDouble();
        // Calculate the acceleration
        double accerlation = (endingVelocity - startingVelocity) / timeSpan;
        // Display the result
        System.out.println("The average accerleration with a starting velocity of " + startingVelocity + " m/s and a ending velocity of ");
        System.out.println(endingVelocity + " m/s with a time span of " + timeSpan + " seconds is " + accerlation);
    }
}
