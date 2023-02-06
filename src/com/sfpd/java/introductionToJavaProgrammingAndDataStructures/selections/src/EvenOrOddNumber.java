package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.selections.src;

import java.util.Scanner;

public class EvenOrOddNumber {
    /* Write a program that prompts the user to enter an integer and displays whether the integer is an odd number or
    not.
    Sample run: 200 ==> 200 is an even number.
    Sample run: 211 ==> 211 is an odd number.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for input
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        // odd or not
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }
}
