package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.elementaryProgramming.src;

import java.util.Scanner;

public class CalculatingEnergy {
    /** Write a program that calculates the energy needed to heat water from
     *  an initial temperature to a final temperature.
     *  Prompt the user to enter the amount of water in kilograms
     *  Prompt the user to enter the initial temperature
     *  Prompt the user to enter the final temperature
     *  Calculate the energy:
     *      Q = M * (finalTemperature - initialTemperature) * 4184
     *  M = weight of water in kilograms
     *  finalTemperature and initialTemperature are in degrees Celcius
     *  energy Q is measured in joules
     */
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
        // Ask for input amount of water, initial temp and final temp
        System.out.println("Enter the amount of water in kilograms: ");
        double amountOfWater = input.nextDouble();
        System.out.println("Enter the initial temperature in degrees Celcius: ");
        double initialTemp = input.nextDouble();
        System.out.println("Enter the final temperature in degrees Celcius: ");
        double finalTemp = input.nextDouble();
        // Calculate the energy
        double energy = amountOfWater * (finalTemp - initialTemp) * 4184;
        // Display result
        System.out.println("The energy needed to heat " + amountOfWater + " kilograms of water from an initial temperature of ");
        System.out.println(initialTemp + " degrees to " + finalTemp + " degrees is " + energy + " joules");
    }
}
