package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.mathematicalFunctionsCharactersAndStrings.src;

import java.util.Scanner;

public class AreaOfAPentagon {
    /* Write a program that prompts the user to enter the length from the center of a pentagon to a vertex (r) and
       computes the area of the pentagon.
       The formula is Area = (5 * pow(s,2)) / (4 * tan(PI / 5))
       s is the length of the side and can be computed using the formula s = 2r sin(PI / 5)
       r is the length from the center of a pentagon to a vertex. Round up two digits after the decimal point
       Sample run:
            Enter the length from the center to a vertex: 5,5
            The area of the pentagon is 71,92
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length from the center to a vertex: ");       // displays question
        double r = input.nextDouble();                                              // vertex
        double s = (2 * r) * (Math.sin(Math.PI / 5));                               // compute side
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));           // compute area
        System.out.printf("The area of the pentagon is %4.2f",area);                // displays result
    }
}
