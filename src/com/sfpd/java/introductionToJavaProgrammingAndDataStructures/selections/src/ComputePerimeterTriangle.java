package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.selections.src;

import java.util.Scanner;

public class ComputePerimeterTriangle {
    /* Write a program that reads three edges for a triangle and computes the perimeter if the input is valid.
    Otherwise, display that the input is invalid. The input is valid if the sum of every pair of two edges is
    greater then the remaining edge.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input
        System.out.println("Enter the first side of the triangle: ");
        double side1 = input.nextDouble();
        System.out.println("Enter the second side of the triangle: ");
        double side2 = input.nextDouble();
        System.out.println("Enter the third side of the triangle: ");
        double base = input.nextDouble();
        // compute perimeter
        double perimeter = side1 + side2 + base;
        // verify if input is valid
        if (side1 + side2 > base) {
            System.out.println("The perimeter of the triangle is " + perimeter);
        } else {
            System.out.println("The input is invalid");
        }
    }
}
