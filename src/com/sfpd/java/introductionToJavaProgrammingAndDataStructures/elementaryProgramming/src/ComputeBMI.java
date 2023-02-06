package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.elementaryProgramming.src;

import java.util.Scanner;

public class ComputeBMI {
    /** BMI = weight in kilograms / spuare of your height in meters.
     *  Write a program that prompt the user to enter a weight in kilograms
     *  and prompt the user to enter a height in meters
     *  Display the BMI
     *  One pound = 0.45359237 kilograms
     *  One inch = 0.0254 meters
     *  95.5 and 50 => 26.8573
     */
     public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
        // Ask user for input
        System.out.println("Enter your weight in pounds: ");
        double weightPounds = input.nextDouble();
        System.out.println("Enter your height in inches: ");
        double heightInches = input.nextDouble();
        // Calculate weightKg
        double weightKg = weightPounds * 0.45359237;
        // Calculate heightMeters
        double heightMeters = heightInches * 0.0254;
        // Calculate BMI
        double bmi = weightKg / Math.pow(heightMeters, 2);
        // Display result
        System.out.println("Your BMI is " + bmi);
    }
}
