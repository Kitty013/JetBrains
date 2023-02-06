package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.elementaryProgramming.src;

import java.util.Scanner;

public class DistanceOfTwoPoints {
    /** Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) and displays the distance
     *  distance = Math.pow(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2)), 0.5)
     *  Display the result
     *  x1 and y1 = 1.5 -3.4
     *  x2 and y2 = 4.5
     *  distance = 8.764131445842194
     */
    public static void main(String[] args) {
    // Create scanner
        Scanner input = new Scanner(System.in);
    // ask for input
        System.out.println("Enter point x1: ");
        double x1 = input.nextDouble();
        System.out.println("Enter point y1: ");
        double y1 = input.nextDouble();
        System.out.println("Enter point x2: ");
        double x2 = input.nextDouble();
        System.out.println("Enter point y2: ");
        double y2 = input.nextDouble();
    // calculate distance
        double distance = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 0.5);
    // Display result
        System.out.println("The distance between the points (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + distance);
    }
}
