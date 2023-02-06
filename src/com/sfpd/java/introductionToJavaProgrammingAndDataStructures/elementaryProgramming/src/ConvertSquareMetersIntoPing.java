package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.elementaryProgramming.src;

import java.util.Scanner;

public class ConvertSquareMetersIntoPing {
    /** Write a program that converts square meter into ping.
     *  Prompt the user to enter a number in square meter, converts it to ping.
     *  Display the result
     *  1 square meter = 0,3025
     */
     public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner(System.in);
        // ask for input
        System.out.println("Enter the number of square meters: ");
        double squareMeters = input.nextDouble();
        // convert it to ping
        double ping = squareMeters * 0.3025;
        // display the result
        System.out.println(squareMeters + " square meters equals " + ping + " pings.");
    }
}
