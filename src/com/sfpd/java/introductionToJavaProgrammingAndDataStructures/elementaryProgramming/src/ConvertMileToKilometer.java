package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.elementaryProgramming.src;

import java.util.Scanner;

public class ConvertMileToKilometer {
    /** Write a program that reads a mile in a double value from the console.
     *  Convert it to kilometers
     *  Display the result
     *  Formula: 1 mile = 1,6 kilometers
     */
     public static void main(String[] args) {
        // import Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles: ");
        double miles = input.nextDouble();
        // convert miles into kilometers with formule
        double kilometers = miles * 1.6;
        // displays result
        System.out.println(miles + " miles equals " + kilometers + " kilometers");
    }
}
