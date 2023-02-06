package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.elementaryProgramming.src;

import java.util.Scanner;

public class AreaOfHexagon {
    /** Write a program that prompts the user to enter the side of a hexagon
        Display its area
        Formula: area = ((3 * Math.pow(3, 0.5)) / 2 ) * Math.pow(side, 2)
     */
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
        // Ask for input from user
        System.out.println("Enter the side of a hexagon: ");
        double sideHexagon = input.nextDouble();
        // Calculate area of hexagon
        double areaHexagon = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(sideHexagon, 2);
        // Display results
        System.out.println("The area of the hexagon with a side of " + sideHexagon + " is " + areaHexagon);
    }
}
