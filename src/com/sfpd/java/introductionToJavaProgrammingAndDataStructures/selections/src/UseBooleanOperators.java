package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.selections.src;

import java.util.Scanner;

public class UseBooleanOperators {
    /* Write a program that prompts the user to enter an integer and determines whether it is divisible by 4 and 5,
    whether it is divisible by 4 or 5, and whether it is divisible by 4 or 5 but not both.
    Sample run: 10 ==> Is 10 divisible by 4 and 5? false
                       Is 10 divisible by 4 or 5? true
                       Is 10 divisible by 4 or 5 but not both? true
     */
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Receive an input
        System.out.println("Enter an number: ");
        int number = input.nextInt();

        System.out.println("Is " + number + " divisible by 4 and 5? " + (number % 4 == 0 && number % 5 == 0));
        System.out.println("Is " + number + " divisible by 4 or 5? " + (number % 4 == 0 || number % 5 == 0));
        System.out.println("Is " + number + " divisible by 4 or 5 but not both? " + (number % 4 == 0 ^ number % 5 == 0));
    }
}