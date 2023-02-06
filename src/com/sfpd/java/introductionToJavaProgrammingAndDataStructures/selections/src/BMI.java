package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.selections.src;

import java.util.Scanner;

public class BMI {
    /* Revise ComputeAndInterpretBMI to let the user enter weight, feet and inches.
    Sample run: 140 - 5 - 10 ==> BMI is 20.087702275404553  Normal
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter weight in ponds
        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();                 // input weight

        // Prompt the user to enter feet
        System.out.println("Enter feet: ");
        double feet = input.nextDouble();

        // Prompt the user to enter height in inches
        System.out.println("Enter inches: ");
        double inches = input.nextDouble();                 // input height

        // Declare constants
        final double KILOGRAMS_PER_POUND = 0.45359237;      // Constant
        final double METERS_PER_INCHES = 0.0254;            // Constant
        final double FEET_PER_INCHES = 12;                  // Constant

        // Compute BMI
        double feetToInches = feet * FEET_PER_INCHES;
        double height = feetToInches + inches;
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCHES;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
