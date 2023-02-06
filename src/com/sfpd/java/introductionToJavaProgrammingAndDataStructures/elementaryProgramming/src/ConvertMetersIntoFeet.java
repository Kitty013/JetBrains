package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.elementaryProgramming.src;

import java.util.Scanner;

public class ConvertMetersIntoFeet {
    /** Write a program that reads a number in meters
     *  Convert it to feet
     *  Display the result
     *  One meter = 3,2786 feet
     */
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the meters: ");
        double meters = input.nextDouble();

        double feet = meters * 3.2786;

        System.out.println(meters + " meters is " + feet + " feet");
    }
}
