package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.selections.src;

import java.util.Scanner;

public class CostOfShipping {
    /* A shipping company uses the following function to calculate the cost (in dollars) of shipping based on the
    weight of the package (in pounds).
                                                    2.5, if 0 < w <= 2
                                       c(w) =       4.5, if 2 < w <= 4
                                                    7.5, if 4 < w <= 10
                                                    10.5, if 10 < w <= 20
    Write a program that prompts the user to enter the weight of the package and display the shipping cost. If the
    weight is greater than 20, display a message "the package cannot be shipped."
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight of the package in pounds: ");
        double weightPackage = input.nextDouble();

        if (weightPackage <= 2) {
            System.out.println("The coast of the shipping is 2.5");
        }
        if (weightPackage > 2 && weightPackage <= 4) {
            System.out.println("The coast of the shipping is 4.5");
        }
        if (weightPackage > 4 && weightPackage <= 10) {
            System.out.println("The coast of the shipping is 7.5");
        }
        if (weightPackage >10 && weightPackage <= 20) {
            System.out.println("The coast of the shipping is 10.5");
        } else {
            System.out.println("The package cannot be shipped");
        }
    }
}
