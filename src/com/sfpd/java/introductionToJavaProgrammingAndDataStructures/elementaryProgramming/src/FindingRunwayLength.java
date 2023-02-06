package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.elementaryProgramming.src;

import java.util.Scanner;

public class FindingRunwayLength {
    /** Write a program that calculate the minimum length of a runway when you have the acceleration and take-off speed
     *  Prompt the user to enter speed v in meters/second and the acceleration a in meters/second squared
     *  Calculate the length = v2 / 2 * a
     */
    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);
        // Ask for input from user
        System.out.println("Enter the speed in meters/second: ");
        double speed = input.nextDouble();
        System.out.println("Enter the acceleration in squared meters/second: ");
        double acceleration = input.nextDouble();
        // Calculate the length of the runway
        double runwayLength = Math.pow(speed,2) / ( 2 * acceleration);
        // display result
        System.out.println("The minimum length of the runway has to be " + runwayLength + " meter");
    }
}
