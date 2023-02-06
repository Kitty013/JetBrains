package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.loops.src;

import java.util.Scanner;

public class SentinelValue {
    /*  gives a program that reads and calculates the sum of an unspecified number of integers. The input 0 signifies
        the end of the input. Just use one variable named data to store the input value, and use a variable named sum
        to store the total. Whenever a value is read, assign it to data and, if it is not zero, add it to sum.
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Read an initial data
        System.out.print("Enter an integer (the input ends if it is 0): ");
        int data = input.nextInt();

        // Keep reading data until the input is 0
        int sum = 0;
        while (data != 0) {
            sum += data;

            // Read the next data
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}
