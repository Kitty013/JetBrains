package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.elementaryProgramming.src;

import java.util.Scanner;

public class ComputeVolumeTriangel {
    /** Write a program that reads in the length of sides, of an equilateral
     *  triangle. Compute the area with formula:
     *    area = Vierkantswortel van 3 / 4 * (lengtes van sides) int kwadraat
     *  Compute the volume = area * length
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the equilateral triangle: ");
        double lengthOfSides = input.nextDouble();

        //Compute area
        double area = (Math. sqrt(3)/4)*(lengthOfSides*lengthOfSides);
        System.out.println("The area of the triangel is " + area);

        double volume = area * lengthOfSides;
        System.out.println("The volume of the triangel is " + volume);
    }
}
