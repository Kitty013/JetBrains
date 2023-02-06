package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.mathematicalFunctionsCharactersAndStrings.src;

import java.util.Scanner;

public class AreaOfAHexagon {
    /*  The area of a hexagon can be computed using the following formula (s is the length of a side):
            area = (6 * pow(x,2)) / (4 * tan(PI / 6))
        Write a program that prompts the user to enter the side of a hexagon and displays its area.
        Sample run:
            Enter the side: 5,5
            The area of the hexagon is 78,59
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of a hexagon: ");
        double side = input.nextDouble();

        double area = ((6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6)));

        System.out.printf("The area of the hexagon is %4.2f", area);
    }
}
