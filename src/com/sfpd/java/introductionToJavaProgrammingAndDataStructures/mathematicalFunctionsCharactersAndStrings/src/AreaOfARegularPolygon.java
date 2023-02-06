package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.mathematicalFunctionsCharactersAndStrings.src;

import java.util.Scanner;

public class AreaOfARegularPolygon {
    /*  A regular polygon is an n-sided polygon in which all sides are of the same length and all angles have the same
        degree. The formula for computing the area of a regular polygon is
            area = (n * pow(s,2)) / (4 * tan(PI / n))
        Here, s is the length of a side. Write a program that prompts the user to enter the number of sides and their
        length of a regular polygon and displays its area.
        Sample run:
            Enter the number of sides: 5
            Enter the side: 6,5
            The area of the polygon is 72,69017017488385
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of sides: ");
        int n = input.nextInt();
        System.out.println("Enter the length of the side: ");
        double s = input.nextDouble();
        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
        System.out.println("The area of the polygon is " + area);
    }
}
